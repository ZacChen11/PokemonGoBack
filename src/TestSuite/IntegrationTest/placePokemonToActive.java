package TestSuite.IntegrationTest;

import org.junit.Test;

import pokemon.GameEngine;
import pokemon.CoreClasses.CardEnergy;
import pokemon.CoreClasses.CardPokemon;
import pokemon.CoreClasses.CardTrainer;
import pokemon.CoreClasses.Play;

public class placePokemonToActive {
	
	@Test
	public void test() {
		GameEngine g = new GameEngine();
		g.iniDeck();
		Play human = new Play();
		Play AI = new Play();
		AI.setDeck();
		
		System.out.println("==========parsing is done=======");
		System.out.println("==========game starts==========");
		System.out.println("==========human player draws seven cards==========");
		human.drawSevenCards(g);
		
	
		
		System.out.println("===========human player hand============");
		for(int i = 0; i < 7 ;i++){
			try{
				if(human.hand[i].m_type == 0){
					System.out.println("pokemon card: "+((CardPokemon)human.hand[i]).m_name);
				}
				if(human.hand[i].m_type == 1){
					System.out.println("energy card: "+ ((CardEnergy)human.hand[i]).m_type);
				}
				if(human.hand[i].m_type == 2){
					System.out.println("trainer card: "+ ((CardTrainer)human.hand[i]).name);
				}
			}catch(Exception e){	
			}
			
		}
		
		System.out.println("===========AI player draws seven cards============");
		AI.drawSevenCards(g);
		System.out.println("===========AI player hand============");
		for(int i = 0; i < 7 ;i++){
			try{
				if(AI.hand[i].m_type == 0){
					System.out.println("pokemon card: "+((CardPokemon)AI.hand[i]).m_name);
				}
				if(AI.hand[i].m_type == 1){
					System.out.println("energy card: "+((CardEnergy)AI.hand[i]).m_type);
				}
				if(AI.hand[i].m_type == 2){
					System.out.println("trainer card: "+((CardTrainer)AI.hand[i]).name);
				}
				if(AI.hand[i] == null){
					System.out.println("nothing");
				}
			}catch(Exception e){
				
			}
		}
		System.out.println("===========human player place pokemon from hand to active============");
		human.placeActive(4);
		System.out.println("===========human hand============");
		for(int i = 0; i < 7 ;i++){
			try{
				if(human.hand[i].m_type == 0){
					System.out.println("pokemon card: "+((CardPokemon)human.hand[i]).m_name);
				}
				if(human.hand[i].m_type == 1){
					System.out.println("energy card: "+ ((CardEnergy)human.hand[i]).m_type);
				}
				if(human.hand[i].m_type == 2){
					System.out.println("trainer card: "+ ((CardTrainer)human.hand[i]).name);
				}
			}catch(Exception e){	
			}
			
		}
		
		System.out.println("===========human active pokemon============");
		if(human.active.m_type == 0){
				System.out.println("pokemon card: "+((CardPokemon)human.active).m_name);
			}
		
		System.out.println("===========AI player places pokemon from hand to active===========");
		AI.placeActive(1);
	
		System.out.println("===========AI player hand============");
		for(int i = 0; i < 7 ;i++){
			try{
				if(AI.hand[i].m_type == 0){
					System.out.println("pokemon card: "+((CardPokemon)AI.hand[i]).m_name);
				}
				if(AI.hand[i].m_type == 1){
					System.out.println("energy card: "+((CardEnergy)AI.hand[i]).m_type);
				}
				if(AI.hand[i].m_type == 2){
					System.out.println("trainer card: "+((CardTrainer)AI.hand[i]).name);
				}
				if(AI.hand[i] == null){
					System.out.println("nothing");
				}
			}catch(Exception e){
				
			}
		}
		
		System.out.println("===========AI player active===========");
		if(AI.active.m_type == 0){
			System.out.println("pokemon card: "+((CardPokemon)AI.active).m_name);
		}
	
	}	
}

