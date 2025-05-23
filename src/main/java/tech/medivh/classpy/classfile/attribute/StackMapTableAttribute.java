package tech.medivh.classpy.classfile.attribute;

import tech.medivh.classpy.classfile.ClassFileReader;

/*
StackMapTable_attribute {
    u2              attribute_name_index;
    u4              attribute_length;
    u2              number_of_entries;
    stack_map_frame entries[number_of_entries];
}
 */
public class StackMapTableAttribute extends AttributeInfo {

    {
        u2("number_of_entries");
    }

    @Override
    protected void readContent(ClassFileReader reader) {
        super.readContent(reader);
        // todo
        reader.skipBytes(super.getUInt("attribute_length") - 2);
    }

}
