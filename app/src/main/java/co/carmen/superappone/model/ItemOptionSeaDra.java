package co.carmen.superappone.model;

/**
 * Created by Alfredo on 15/05/2015.
 */
public class ItemOptionSeaDra {

    private int idIcon;
    private int idText;
    private int idDes;
    private int idPri;

    public ItemOptionSeaDra(int idIcon, int idText,int idDes,int idPri) {
        this.idIcon = idIcon;
        this.idText = idText;
        this.idDes = idDes;
        this.idPri = idPri;
    }

    public int getIdIcon() {
        return idIcon;
    }

    public int getIdText() {
        return idText;
    }

    public int getIdDes() {return idDes; }

    public int getIdPri() {
        return idPri;
    }

}