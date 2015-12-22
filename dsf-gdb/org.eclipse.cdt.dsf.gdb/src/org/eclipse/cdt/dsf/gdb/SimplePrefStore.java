package org.eclipse.cdt.dsf.gdb;

/**
 * @since 5.0
 */
public class SimplePrefStore {
    private static boolean isGdbRecordEnable;

    public boolean getRecordAttr() {
        return isGdbRecordEnable;
    }

    public void setRecordAttr(boolean attrib) {
        isGdbRecordEnable = attrib;
    }
}
