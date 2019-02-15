/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bossbattlemi.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author vishnukdawah
 */
public class Boss {
    
    
int bossId; 
String bossName;
String bossType;
int bossMaxHP;
int bossHP;
int bossATK;
int bossDEF;
List<Move> listOfBossMoves = new ArrayList<>();

    public int getBossId() {
        return bossId;
    }

    public void setBossId(int bossId) {
        this.bossId = bossId;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public String getBossType() {
        return bossType;
    }

    public void setBossType(String bossType) {
        this.bossType = bossType;
    }

    public int getBossMaxHP() {
        return bossMaxHP;
    }

    public void setBossMaxHP(int bossMaxHP) {
        this.bossMaxHP = bossMaxHP;
    }

    public int getBossHP() {
        return bossHP;
    }

    public void setBossHP(int bossHP) {
        this.bossHP = bossHP;
    }

    public int getBossATK() {
        return bossATK;
    }

    public void setBossATK(int bossATK) {
        this.bossATK = bossATK;
    }

    public int getBossDEF() {
        return bossDEF;
    }

    public void setBossDEF(int bossDEF) {
        this.bossDEF = bossDEF;
    }

    public List<Move> getListOfBossMoves() {
        return listOfBossMoves;
    }

    public void setListOfBossMoves(List<Move> listOfBossMoves) {
        this.listOfBossMoves = listOfBossMoves;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.bossId;
        hash = 11 * hash + Objects.hashCode(this.bossName);
        hash = 11 * hash + Objects.hashCode(this.bossType);
        hash = 11 * hash + this.bossMaxHP;
        hash = 11 * hash + this.bossHP;
        hash = 11 * hash + this.bossATK;
        hash = 11 * hash + this.bossDEF;
        hash = 11 * hash + Objects.hashCode(this.listOfBossMoves);
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
        final Boss other = (Boss) obj;
        if (this.bossId != other.bossId) {
            return false;
        }
        if (this.bossMaxHP != other.bossMaxHP) {
            return false;
        }
        if (this.bossHP != other.bossHP) {
            return false;
        }
        if (this.bossATK != other.bossATK) {
            return false;
        }
        if (this.bossDEF != other.bossDEF) {
            return false;
        }
        if (!Objects.equals(this.bossName, other.bossName)) {
            return false;
        }
        if (!Objects.equals(this.bossType, other.bossType)) {
            return false;
        }
        if (!Objects.equals(this.listOfBossMoves, other.listOfBossMoves)) {
            return false;
        }
        return true;
    }



    
}
