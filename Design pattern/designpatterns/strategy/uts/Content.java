/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.strategy.uts;

/**
 *
 * @author user
 */
public abstract class Content {
    private ShareStrategy shareStrategy;
    private GenerateContentStrategy generateContentStrategy;
    
    public void share(){
        this.shareStrategy.share();
    }
    public void generateShareContent(){
        this.generateContentStrategy.generate();
    }

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    public void setGenerateContentStrategy(GenerateContentStrategy generateContentStrategy) {
        this.generateContentStrategy = generateContentStrategy;
    }
    
    public abstract void display();
    public abstract void selectContent();
}
