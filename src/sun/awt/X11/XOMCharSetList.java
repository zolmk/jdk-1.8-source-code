// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import sun.util.logging.PlatformLogger;
public class XOMCharSetList extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 16; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	public XOMCharSetList(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	public XOMCharSetList() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public int get_charset_count() { log.finest("");return (Native.getInt(pData+0)); }
	public void set_charset_count(int v) { log.finest(""); Native.putInt(pData+0, v); }
	public long get_charset_list(int index) { log.finest(""); return Native.getLong(pData+8)+index*Native.getLongSize(); }
	public long get_charset_list() { log.finest("");return Native.getLong(pData+8); }
	public void set_charset_list(long v) { log.finest(""); Native.putLong(pData + 8, v); }


	String getName() {
		return "XOMCharSetList"; 
	}


	String getFieldsAsString() {
		StringBuilder ret = new StringBuilder(80);

		ret.append("charset_count = ").append( get_charset_count() ).append(", ");
		ret.append("charset_list = ").append( get_charset_list() ).append(", ");
		return ret.toString();
	}


}



