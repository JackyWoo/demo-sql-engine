package woo.sql.analyzer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by wujianchao on 2022/12/9.
 */
public class QualifiedName {
    private List<String> parts;

    public QualifiedName(List<String> parts) {
        Objects.requireNonNull(parts, "parts");
        this.parts = parts;
    }

    public List<String> getParts() {
        return parts;
    }

    public String getName() {
        return parts.get(parts.size() - 1);
    }

    public List<String> getParent() {
        List<String> parent = new ArrayList<>();
        parent.addAll(parts);
        parent.remove(parts.size() - 1);
        return parent;
    }

    public void setParts(List<String> parts) {
        this.parts = parts;
    }

    public static QualifiedName of(List<String> parts) {
        return new QualifiedName(parts);
    }

    @Override
    public String toString() {
        return parts.isEmpty() ? "" : String.join(".", parts);
    }
}
