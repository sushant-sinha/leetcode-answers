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