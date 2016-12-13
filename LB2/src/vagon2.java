public class vagon2 extends vagon {
    public void IzmenitxChisloMest(int NewMesta) {
        ChisloMest = NewMesta;
        System.out.println(">>Mest-" + ChisloMest + "; \n ");
    }
    public void ZanyatxMesto(int NomerMesta)  {
    if (Mesta[NomerMesta-1]==1) {
        System.out.print(">>Место № " + NomerMesta + " в вагоне № " + NomerEtogoVagona+ " занято\n");
    }
    else if (Mesta[NomerMesta-1]==0) {
        Mesta[NomerMesta-1]=1;
        System.out.print(">>You have reserved a "+ NomerMesta +" place in " + NomerEtogoVagona + " car; \n");
    }
}
    public void VagonInfo(){

        System.out.println(">>Nomer Vagona-"+ NomerEtogoVagona  +":");
        int summFree = 0;
        for (int i=0;i<ChisloMest;i++){
            if (Mesta[i]==0) summFree++;
        }
        System.out.println(">>Chislo mest-" + summFree + "; \n");

        for (int i=0;i<ChisloMest;i++)
            if (Mesta[i]==0) System.out.print((i+1)+" ");
        System.out.println("\n");
    }




}

