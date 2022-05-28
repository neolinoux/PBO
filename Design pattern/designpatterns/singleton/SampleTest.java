/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.singleton;

/**
 *
 * @author user
 */
public class SampleTest {
    private String sample;

    public String getSample() {
        sample = Singleton.getInstance().getSample();
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
        Singleton.getInstance().setSample(sample);
    }
    
    
    
    
}
