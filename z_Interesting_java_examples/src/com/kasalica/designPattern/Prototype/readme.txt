Allocating memory might not be the slow part of creating your object. 
If the object is data driven or otherwise the result of a calculation, 
it is sometimes prudent to cache the result so that that result can be cloned 
rather than re-done. Thus, the Prototype pattern.