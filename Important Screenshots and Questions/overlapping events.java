/*

    Found a good way of comparing intervals and identifying iverlaps:

    Math.max(start, event[0]) < Math.min(end, event[1])
    
    The maximum of the start of the two events must be smaller than the minimum of the end of two events.

    This condition ensure all 3 cases (there are actually 6 cases, the other 3 are when the newer event is replace by the older event and vice-versa):
    1) when the start of the new event is after the start of the older event(), and the end of the older event is after the start of the newer event. But, the end of the newer event is after the end of the older event.
    example:

    old: [10,20]
    new: [12,24]

    2) when the end of the new event is after the start of the older event, and the start of the newer event is before the start of the older event. But, the end of the older event is after the end of the newer event.

    example:

    old: [10,20]
    new: [8,13]

    3) when the new event is completely engulfed by the older event

    example:

    old: [10,20]
    new: [12,15]

    See 731. My Calendar II question for more information
*/