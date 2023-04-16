// SUSHANT SINHA

// 220ms ( 57.89% ) 56.7mb ( 88.16% )

/**
 * @param {number} rowsCount
 * @param {number} colsCount
 * @return {Array<Array<number>>}
 */
Array.prototype.snail = function(rowsCount, colsCount) {

    if(rowsCount*colsCount!=this.length)
        return [];

    let ans = Array(rowsCount).fill([]).map(() => []);

    let upDownDir=true;
    let startIndex=-1;

    for(let i=0; i<colsCount; i++){

        if(!upDownDir){
            startIndex+=rowsCount;
        }

        for(let j=0; j<rowsCount; j++){

            if(upDownDir)
            ans[j][i]=this[++startIndex];

            else
            ans[j][i]=this[startIndex-j];
        }

        upDownDir=!upDownDir;

    }

    return ans;

}

/**
 * const arr = [1,2,3,4];
 * arr.snail(1,4); // [[1,2,3,4]]
 */

// maths solution from the Solutions section

/**
 * @param {number} rowsCount
 * @param {number} colsCount
 * @return {Array<Array<number>>}
 */
Array.prototype.snail = function(rowsCount, colsCount) {
    if(this.length !==  rowsCount * colsCount) return [];
    let result = Array(rowsCount).fill([]).map(() => []);
    for(let j = 0; j < this.length; j++){
        const i = Math.floor(j / rowsCount);
        if(i % 2 === 0){
            result[j % rowsCount][i] = this[j];
        }else{
            result[rowsCount - j % rowsCount - 1][i] = this[j];
        }
    }
    return result;
}

/**     
 * const arr = [1,2,3,4];
 * arr.snail(1,4); // [[1,2,3,4]]
 */