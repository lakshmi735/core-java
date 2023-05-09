class Prime
{
static String kannadaWebSeries[]={"Myname","Nevertheless ","Ellinda Barthiro Nivella","Dove Manja","Kyaabre","The Other Love Story","First Kiss","Just Married","Inti Ninna","Rathnan Prapancha","Yuvarathna","Act 1978","Ammachi Yemba Nenapu","Krishna Tulasi","Honeymoon"};
static String hindiWebSeries[]={"Family Man","Mirzapur","Made in Heaven","Guilty Minds","inside Edge","Hostel Daze","Pushpavalli","Panchayat","Breathe","Breathe into the Shadows","Malgudi days","The Forgotten army","Afsos","Going Viral","Four More Shots Please"};
static String englishWedSeries[]={"Bosch","The Boys","Billions","Dexter","The Fall","Fleabag","Forever","Good Omens","Homecoming","House","Hunters","I Love Lucy","Jack Ryan","Lorena","Mad About You"};
public static void main(String a[])
{
	getKannadaWebSeries();
	getHindiWebSeries();
	getEnglishWedSeries();
}
	public static void getKannadaWebSeries()
	{
	System.out.println("The Kannada Web Series List are......:");
	//System.out.println(kannadaWebSeries[0]+","+kannadaWebSeries[1]+","+kannadaWebSeries[2]+","+kannadaWebSeries[3]+","+kannadaWebSeries[4]+","+kannadaWebSeries[5]+","+kannadaWebSeries[6]+","+kannadaWebSeries[7]+","+kannadaWebSeries[8]+","+kannadaWebSeries[9]+","+kannadaWebSeries[10]+","+kannadaWebSeries[11]+","+kannadaWebSeries[12]+","+kannadaWebSeries[13]+","+kannadaWebSeries[14]);
    for(int i=0;i<15;i++)
	{
		System.out.println(kannadaWebSeries[i]);
	}
	}
	public static void getHindiWebSeries()
	{
	System.out.println("The Hindi Web Series List are......:");
	//System.out.println(hindiWebSeries[0]+","+hindiWebSeries[1]+","+hindiWebSeries[2]+","+hindiWebSeries[3]+","+hindiWebSeries[4]+","+hindiWebSeries[5]+","+hindiWebSeries[6]+","+hindiWebSeries[7]+","+hindiWebSeries[8]+","+hindiWebSeries[9]+","+hindiWebSeries[10]+","+hindiWebSeries[11]+","+hindiWebSeries[12]+","+hindiWebSeries[13]+","+hindiWebSeries[14]);
    for(int i=0;i<15;i++)
	{
		System.out.println(hindiWebSeries[i]);
	}
	}
	public static void getEnglishWedSeries()
	{
	System.out.println("The English Web Series List are......:");
	//System.out.println(englishWedSeries[0]+","+englishWedSeries[1]+","+englishWedSeries[2]+","+englishWedSeries[3]+","+englishWedSeries[4]+","+englishWedSeries[5]+","+englishWedSeries[6]+","+englishWedSeries[7]+","+englishWedSeries[8]+","+englishWedSeries[9]+","+englishWedSeries[10]+","+englishWedSeries[11]+","+englishWedSeries[12]+","+englishWedSeries[13]+","+englishWedSeries[14]);
     for(int i=0;i<15;i++)
	 {
		 System.out.println(englishWedSeries[i]);
	 }
}

}