/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
import java.util.ArrayList;
public class RecipeManager {

    private ArrayList<Recipe> recipes;

    public RecipeManager() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);

    }

    
    public void printByName(String name) {

        if (this.recipes.isEmpty()) {

            System.out.println("None found");
        } else {
            for (Recipe e : this.recipes) {

                //lowercases both so regradless of case
                if (e.getName().toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(e);

                }

            }

        }

    }

    public void printByTime(String time) {

        if (this.recipes.isEmpty()) {

            System.out.println("None found");
        } else {
            for (Recipe e : this.recipes) {

                //lower caseing both so it finds it regradless of case
                if (e.getTime() <= Integer.valueOf(time)) {

                    System.out.println(e);

                }

            }

        }

    }

    public void printByIngredient(String ingredient) {

        if (this.recipes.isEmpty()) {

            System.out.println("None found");
        } else {
            for (Recipe e : this.recipes) {

                //lower caseing both so it finds it regradless of case
                if (e.getIngredients().contains(ingredient.toLowerCase())) {

                    System.out.println(e);

                }

            }

        }

    }

    public void printRecipeBook() {

        for (Recipe e : this.recipes) {
            System.out.println(e);

        }

    }

}