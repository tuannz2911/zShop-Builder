package fr.maxlego08.shop.save;

import java.util.ArrayList;
import java.util.List;

import fr.maxlego08.shop.zcore.utils.storage.Persist;
import fr.maxlego08.shop.zcore.utils.storage.Saveable;

public class Lang implements Saveable {

	public static String prefix = "�8(�bzShop�8)";
	
	public static String commandHelp = "�a� �6%syntaxe% �7- �e%description%";
	public static String noPermission = "�cYou don't have permission !";
	public static String syntaxeError = "�cYou must execute the command like this �7: �a%command%";
	public static String commandError = "�cThis argument does not exist!";
	public static String commandCategoryError = "�cUnable to find categories with id �6%id%�c.";
	public static String commandItemError = "�cUnable to create the item with this id �6%id%�c.";
	public static String onlinePlayerCanUse = "�cYou must be player to do this !";
	
	public static String shopInventoryItem = "�a%category% �e%page%�7/�6%maxPage%";
	public static String shopInventoryUniqueItem = "�a%category%";
	
	public static String canSell = "�cUnable to sell";
	public static String canBuy = "�cUnable to buy";
	public static String sellItem = "�aYou just sold �6x%amount% %item%�a for �6%price%�a%currency% !";
	public static String buyItem = "�aYou just sold �6x%amount% %item%�a for �6%price%�a%currency% !";
	public static String buyUniqueItem = "�aYou just bought �6%item%�a for �6%price%�a%currency% !";
	public static String notEnouhtItems = "�cYou do not have enough items in your inventory.";
	public static String notEnouhtMoney = "�cYou do not have enough money.";
	public static String notEnouhtPlace = "�cYour inventory is ful";
	public static String notItems = "�cYou do not have this item in your inventory.";
	public static String and = "and";
	public static String sellAllError = "�cYou don't have any item to sell.";
	public static String sellHandAll = "�aYou just sold �6%item% �afor �6%price%�a%currency%.";
	public static String sellHandAllItem = "�ax�e%amount% �2%item%�a";
	public static String sellHandEmpty = "�cUnable to find an item for sale.";
	public static String sellHandAir = "�cYou can't sell air !";
	public static String boostError = "�cImpossible to boost this item, a boost is already in progress.";
	public static String boostSuccess = "�aYou have just created a boost for the item �6%item%�a.";
	public static String boostBroadcast = "�aItem �2%item% �ajust had a boost �2%boosttype% �awhile �2%timer% �awith a multiplier of �2%modifier%�a.";
	public static String boostBuy = "purchase";
	public static String boostSell = "of sale";
	public static String boostItemSell = "�7�m%defaultPrice%%currency%�b � �a�l%newPrice%%currency%";
	public static String boostItemBuy = "�7�m%defaultPrice%%currency%�b � �a�l%newPrice%%currency%";
	public static String boostErrorFound = "�cNo boost is available for �6%item%�c.";
	public static String boostStopSuccess = "�aYou just stopped the boost on �6%item%�a.";
	public static String boostEmpty = "�cNo boost in progress.";
	public static String boostShow = "�aBoost �2%type% �aon the item �2%item% �awhile�6 %timer% �awith a multiplier of�2 %modifier% �a.";
	public static String shopConfigError = "�cYou can't config this category with this type.";
	
	public static String configAddItemError = "�cItem �6%item% �calready exists in the shop!";
	public static String configAddItemErrorCategory = "�cThe selected category cannot have items for sale!";
	public static String configAddItemSuccess = "�aYou have just added the item �6%item% �ain the category �6%category%�a.";
	public static String configRemoveItemSuccess = "�aYou have just deleted the item �6%item% �afrom the category �6%category%�a.";
	public static String configRemoveItemError = "�cItem �6%item% �cdoes not exist in the shop!";
	public static String configEditError = "�cUnable to find the item!";
	public static String configEditSuccess = "�aYou just changed the price �6%type% �afor the item �6%item% �aat �6%price%�a$.";
		public static List<String> displayItemLore = new ArrayList<String>();
	public static List<String> displayItemLoreBoost = new ArrayList<String>();
	
	public static String second = "second";
	public static String minute = "minute";
	public static String hour = "hour";
	public static String day = "day";
	
	public static String currencyVault = "$";
	public static String currencyPlayerPoint = "�";
	public static String currencyTokenManager = "T";
	public static String currencyMySQLToken = "MT";
	public static String currencyIceToken = "*";
	
	static{
		
		displayItemLore.add("�f� �2Buying price�7: �a%buyPrice%%currency%");
		displayItemLore.add("�f� �2Selling price�7: �a%sellPrice%%currency%");
		displayItemLore.add("%boostinfo%");
		displayItemLore.add("�f� �7Left click to buy");
		displayItemLore.add("�f� �7Click wheel to sell everything");
		displayItemLore.add("�f� �7Right click to sell");
		
		displayItemLoreBoost.add("");
		displayItemLoreBoost.add("�f� �7Boost of �ax%modifier% �7!");
		displayItemLoreBoost.add("�f� �7End of boost in �2%ending%");
		displayItemLoreBoost.add("");
		
	}
	
	private static transient Lang i = new Lang();


	@Override
	public void save(Persist persist) {
		persist.save(i, "lang");
	}

	@Override
	public void load(Persist persist) {
		persist.loadOrSaveDefault(i, Lang.class, "lang");
	}

}