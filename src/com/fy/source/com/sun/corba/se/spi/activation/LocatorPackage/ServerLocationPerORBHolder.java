package com.sun.corba.se.spi.activation.LocatorPackage;

/**
* com/sun/corba/se/spi/activation/LocatorPackage/ServerLocationPerORBHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/centos/8/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Monday, April 22, 2024 9:31:03 AM UTC
*/

public final class ServerLocationPerORBHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB value = null;

  public ServerLocationPerORBHolder ()
  {
  }

  public ServerLocationPerORBHolder (com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORBHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORBHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORBHelper.type ();
  }

}
