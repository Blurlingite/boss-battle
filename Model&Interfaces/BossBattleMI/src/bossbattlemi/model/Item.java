/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bossbattlemi.model;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author vishnukdawah
 */
public class Item {
    
int itemId; 
String itemName;
String itemType;    // Ex. HP, ATK, DEF
int itemEffectValue;    // for items that use a number
BigDecimal itemEffectPercent;   // for items that use a percent instead
int itemCost;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemEffectValue() {
        return itemEffectValue;
    }

    public void setItemEffectValue(int itemEffectValue) {
        this.itemEffectValue = itemEffectValue;
    }

    public BigDecimal getItemEffectPercent() {
        return itemEffectPercent;
    }

    public void setItemEffectPercent(BigDecimal itemEffectPercent) {
        this.itemEffectPercent = itemEffectPercent;
    }

    public int getItemCost() {
        return itemCost;
    }

    public void setItemCost(int itemCost) {
        this.itemCost = itemCost;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.itemId;
        hash = 73 * hash + Objects.hashCode(this.itemName);
        hash = 73 * hash + Objects.hashCode(this.itemType);
        hash = 73 * hash + this.itemEffectValue;
        hash = 73 * hash + Objects.hashCode(this.itemEffectPercent);
        hash = 73 * hash + this.itemCost;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.itemId != other.itemId) {
            return false;
        }
        if (this.itemEffectValue != other.itemEffectValue) {
            return false;
        }
        if (this.itemCost != other.itemCost) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        if (!Objects.equals(this.itemEffectPercent, other.itemEffectPercent)) {
            return false;
        }
        return true;
    }


    
}
