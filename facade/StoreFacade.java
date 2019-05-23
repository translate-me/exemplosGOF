public class StoreFacade {

    AddToStorage addToStoreObject;
    RemoveFromStorage removeFromStorageObject;
    SellProduct sellProductObject;
    RefundProduct refundProductObject;

    public StoreFacade(AddToStorage addToStoreObject, RemoveFromStorage removeFromStorageObject, SellProduct sellProductObject, RefundProduct refundProductObject){
        this.addToStoreObject = addToStoreObject;
        this.removeFromStorageObject = removeFromStorageObject;
        this.sellProductObject = sellProductObject;
        this.refundProductObject = refundProductObject;
    }

    public String add(String a, Integer b) {
        return this.addToStoreObject.add(a, b);
    }

    public String remove(String a, Integer b) {
        return this.removeFromStorageObject.remove(a, b);
    }

    public String sell(String a, Integer b) {
        return this.sellProductObject.sell(a, b);
    }

    public String refund(String a, Integer b) {
        return this.refundProductObject.refund(a, b);
    }
}