package co.carmen.superappone.model;

import android.net.Uri;

import co.carmen.superappone.rest.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Alfredo on 14/05/2015.
 */
public class Product {

    @SerializedName(Constants.ID_KEY)
    int id;

    @SerializedName(Constants.NAME_KEY)
    String name;

    @SerializedName(Constants.DESCRIPTION_KEY)
    String description;

    @SerializedName(Constants.PRICE_KEY)
    String price;

    @Expose
    Uri urlImage;


}
