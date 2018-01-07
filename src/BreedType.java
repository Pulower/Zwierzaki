public enum BreedType {

    Bulldog, York, Doberman, Husky, Labrador;

    public String setBreedType(BreedType breed)
    {
        switch(breed) {
            case Bulldog:
            {
                return "Bulldog";
            }
            default:
            {
                return "";
            }
        }
    }
}
