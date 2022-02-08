package openfoodfacts.github.scrachx.openfood.models.entities;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Property;

import javax.annotation.Nullable;

@Entity(
    nameInDb = "YOUR_LISTED_PRODUCT",
    indexes = {@Index(value = "listId, barcode", unique = true)}
)
public class ListedProduct {
    @Id(autoincrement = true)
    Long id;
    @Property(nameInDb = "barcode")
    String barcode;
    @Property(nameInDb = "listId")
    Long listId;
    @Property(nameInDb = "listName")
    String listName;
    @Property(nameInDb = "productName")
    String productName;
    @Property(nameInDb = "productDetails")
    String productDetails;
    @Property(nameInDb = "imageUrl")
    String imageUrl;

    @Generated(hash = 932048190)
    public ListedProduct(Long id, String barcode, Long listId, String listName,
                         String productName, String productDetails, String imageUrl) {
        this.id = id;
        this.barcode = barcode;
        this.listId = listId;
        this.listName = listName;
        this.productName = productName;
        this.productDetails = productDetails;
        this.imageUrl = imageUrl;
    }

    @Generated(hash = 85111474)
    public ListedProduct() {
    }

    public String getBarcode() {
        return this.barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Long getListId() {
        return this.listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

    public String getListName() {
        return this.listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetails() {
        return this.productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    @Nullable
    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
