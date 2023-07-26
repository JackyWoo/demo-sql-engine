package woo.metadata;

import woo.sql.analyzer.PrimitiveType;
import woo.sql.analyzer.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wujianchao on 2022/12/22.
 */
public class Function {
    private final String name;
    private final Type returnType;
    private final Type[] argTypes;

    private static final Map<String, List<Function>> ALL_FUNCTIONS = new HashMap<>();

    public static boolean register(Function function) {
        List<Function> candidates;
        if (ALL_FUNCTIONS.containsKey(function.getName())) {
            candidates = ALL_FUNCTIONS.get(function.getName());
        } else {
            candidates = new ArrayList<>();
            ALL_FUNCTIONS.put(function.getName(), candidates);
        }
        for(Function candidate : candidates) {
            if (candidate.equals(function)) {
                return false;
            }
        }
        candidates.add(function);
        return true;
    }

    public static Function get(String name, Type[] argTypes) {
        if (!ALL_FUNCTIONS.containsKey(name))
            return null;
        List<Function> candidates = ALL_FUNCTIONS.get(name);
        Function compatibleOne = null;
        Function tmp = new Function(name, new Type(PrimitiveType.VOID), argTypes);
        for(Function candidate : candidates) {
            if (tmp.isIdentical(candidate))
                return candidate;
            if (tmp.isAssignCompatible(candidate))
                compatibleOne = candidate;
        }
        return compatibleOne;
    }

    public static boolean contains(String name, Type[] argTypes) {
        return get(name, argTypes) != null;
    }

    public Function(String name, Type returnType, Type[] argTypes) {
        this.name = name;
        this.returnType = returnType;
        this.argTypes = argTypes;
    }

    public String getName() {
        return name;
    }

    public Type getReturnType() {
        return returnType;
    }

    public Type[] getArgTypes() {
        return argTypes;
    }

    private boolean isAssignCompatible(Function o) {
        if(this.argTypes.length != o.argTypes.length)
            return false;
        for (int i = 0; i < this.argTypes.length; ++i) {
            if (this.argTypes[i].isAssignableFrom(o.argTypes[i])) {
                continue;
            }
            if (!this.argTypes[i].canCastTo(o.argTypes[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean isIdentical(Function o) {
        if (!o.name.equals(name)) {
            return false;
        }
        if (o.argTypes.length != this.argTypes.length) {
            return false;
        }
        for (int i = 0; i < this.argTypes.length; ++i) {
            if (!this.argTypes[i].isAssignableFrom(o.argTypes[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Function))
            return false;
        Function o = (Function) obj;
        if (!o.name.equals(name)) {
            return false;
        }
        if (o.argTypes.length != this.argTypes.length) {
            return false;
        }
        for (int i = 0; i < this.argTypes.length; ++i) {
            if (this.argTypes[i] != o.argTypes[i]) {
                return false;
            }
        }
        return true;
    }
}
