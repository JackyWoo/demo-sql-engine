package woo.sql.analyzer;

/**
 * Created by wujianchao on 2022/11/25.
 */
import com.google.common.collect.ImmutableList;
import woo.sql.analyzer.Field;

import java.util.List;

import static com.google.common.base.Preconditions.checkElementIndex;
import static java.util.Objects.requireNonNull;

public class RelationFields {
    private final List<Field> allFields;

    public RelationFields(Field... fields) {
        this(ImmutableList.copyOf(fields));
    }

    public RelationFields(List<Field> fields) {
        requireNonNull(fields, "fields is null");
        this.allFields = ImmutableList.copyOf(fields);
    }

    /**
     * Gets the index of the specified field.
     */
    public int indexOf(Field field) {
        return allFields.indexOf(field);
    }

    /**
     * Gets the field at the specified index.
     */
    public Field getFieldByIndex(int fieldIndex) {
        checkElementIndex(fieldIndex, allFields.size(), "fieldIndex");
        return allFields.get(fieldIndex);
    }

    public List<Field> getAllFields() {
        return allFields;
    }

}
