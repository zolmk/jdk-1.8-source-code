package org.omg.CosNaming;

/**
* org/omg/CosNaming/BindingTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /home/centos/8/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Monday, April 22, 2024 9:31:03 AM UTC
*/


/**
   * Specifies whether the given binding is for a object (that is not a
   * naming context) or for a naming context.
   */
public final class BindingTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.BindingType value = null;

  public BindingTypeHolder ()
  {
  }

  public BindingTypeHolder (org.omg.CosNaming.BindingType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.BindingTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.BindingTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.BindingTypeHelper.type ();
  }

}
