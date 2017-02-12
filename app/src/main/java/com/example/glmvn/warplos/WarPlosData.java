package com.example.glmvn.warplos;

public class WarPlosData {
private String mName;
private String mDescription;

public static final WarPlosData[] warplosdata = {
  new WarPlosData("Warkop SS","menyediakan minuman kopi\nTerletak di RT01 RW02 Karplos"),
  new WarPlosData("Syul PotoCopy","menerima potocopy scan, penjilidan,print\nTerletak di RT01 RW02 Karplos"),
  new WarPlosData("Warkop Giono","menyediakan berbaga macam makanan dan minuman\nTerletak di RT01 RW02 karplos"),
  new WarPlosData("Toko Yatining","menyediakan berbagai macam kebutuhan pokok sehari-hari\nTerletak di RT01 RW02 karplos"),
  new WarPlosData("Warkop Rindu Rasa","menyediakan minuman kopi dan degan\nTerletak di RT01 RW02 karplos"),
  new WarPlosData("Toko Cinta","menyediakan kebutuhan pokok sehari hari dan tambal ban\nTerletak di RT01 RW02 karplos"),
  new WarPlosData("Warung makan Wiwik", "menyediakan berbagai menu makanan dan minuman\nTerletak di RT01 RW02 karplos"),
  new WarPlosData("Warung Wakti","menyediakan berbagai makanan dan minuman\nTerletak di RT01 RW02 karplos"),
  new WarPlosData("Toko Eyang","menyediakan berbagai macam kebutuhan sehari hari\nTerletak d RT01 RW02 karplos"),
  new WarPlosData("Warung MakPauwan","menyediakan nasi rawon dan lain lain\nTerletak di RT02 RW02 karplos"),
  new WarPlosData("Bogel Cell","menyediakan pulsa dan asesoris hape\nTerletak di RT02 RW02 karplos"),
  new WarPlosData("Depo jamu Mugi Waras","menyediakan jamu dan berbagai macam kebutuhan pokok\nTerletak di RT02 RW02 karplos")

};

private WarPlosData(String mName,String mDescription){
    this.mName = mName;
    this.mDescription = mDescription;
}

    public String getmDescription() {
        return mDescription;
    }

    public String getmName() {
        return mName;
    }

    public String toString(){
    return this.mName;
    }
}
