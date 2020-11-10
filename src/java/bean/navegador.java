
package bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class navegador {

  public String metodo2(){
      return "sonrisa.xhtml";
  }
  
  public String metodo3(){
      return "elementosIU.xhtml";
  }
  
  public String metodo4(){
      return "facelet.xhtml";
  }

}