package vvgbankomat;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("izborListicaDat")
public class izborListicaDat implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("izborListicaDaNe")
   private Integer izborListicaDaNe;

   public izborListicaDat()
   {
   }

   public java.lang.Integer getIzborListicaDaNe()
   {
      return this.izborListicaDaNe;
   }

   public void setIzborListicaDaNe(java.lang.Integer izborListicaDaNe)
   {
      this.izborListicaDaNe = izborListicaDaNe;
   }

   public izborListicaDat(java.lang.Integer izborListicaDaNe)
   {
      this.izborListicaDaNe = izborListicaDaNe;
   }

}