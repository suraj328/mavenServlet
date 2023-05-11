package model;


public class StoreData {
    private int id;
    private String name;
    private  String tech;
    //for id
    public void setId(int id)
    {
        this.id =  id;
    }
    public int getId()
    {
        return id;
    }
    //name
    public void setName(String name)
    {
        this.name =  name;
    }
    public String getName()
    {
        return name;
    }
    //tech
    public void setTech(String tech)
    {
        this.tech =  tech;
    }
    public String getTech()
    {
        return tech;
    }

    public String toString(){
        return "StoreData [id="+id+",name="+name+",tech="+tech+"]";
    }
}
