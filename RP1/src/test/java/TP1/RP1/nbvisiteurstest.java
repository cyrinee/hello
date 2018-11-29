package TP1.RP1;

import junit.framework.TestCase;

public class nbvisiteurstest extends TestCase {
	public void test() throws limiteVisiteurException {

	
Zoo z=new Zoo(9);

for(int i=0;i<4;i++)
{
	z.nouveauvisiteur();}

try {
	z.nouveauvisiteur();
	fail("exception non envoyée");


}
catch(limiteVisiteurException e) {
	
	
}}}


