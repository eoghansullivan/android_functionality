public class AlcoholCalculator
{
    private int hoursSinceDrink;
    private int typeOfDrink; // 1 - 14% wine, 2 12.5% wine, 3 - 4 % alcopop, 4 - 3% pint, 5 - 7% pint 3 drinks, 6 - shot of spirits
    private int amountOfDrinks;

    public AlcoholCalculator(int hours, int type, int amount)
    {
        hoursSinceDrink = hours;
        typeOfDrink = type;
        amountOfDrinks = amount;
    }

    public int alcoholInYou()
    {
        if (typeOfDrink == 1 || typeOfDrink == 2 || typeOfDrink == 3 || typeOfDrink == 6)
        {
            return amountOfDrinks - hoursSinceDrink;
        } else if (typeOfDrink == 5)
        {
            return (amountOfDrinks * 3) - hoursSinceDrink;
        }
        return 0;
    }
}
