package com.gradle.staticScrapeService;

import java.io.IOException;

public class mainDriver {
    public static String WIKIDOT_URL = "http://dnd5e.wikidot.com";
    public static void main(String[] args) throws IOException{

        EntitySearch service = new EntitySearch();

        SpellSearch spellSearch = new SpellSearch();
//        Entity entity = spellSearch.searchEntityInfo("fireball");
        Spell entity = (Spell) spellSearch.searchEntityInfo("fireballsss");

        ItemSearch itemSearch = new ItemSearch();

        System.out.println(entity.getName());
        System.out.println(entity.getSource());
//        System.out.println(entity.getTypeRarity());
        System.out.println(entity.getDescription());
        System.out.println(entity.getURL());
    }


}
