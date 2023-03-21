package com.example.early_diagnosis;

import java.io.DataInputStream;

public class Medical {
    DataInputStream dis = new DataInputStream(System.in);
    int totalNoOfRaw = 0;

    int haveDyslexiaYes = 0;
    int haveDyspraxiaYes = 0;
    int haveAdhdAddYes = 0;
    int haveAutismYes = 0;
    int haveNoYes = 0;

    int haveDyslexiaNo = 0;
    int haveDyspraxiaNo = 0;
    int haveAdhdAddNo = 0;
    int haveAutismNo = 0;
    int haveNoNo = 0;

    int holdPencilPensMarkersNeverYes = 0;
    int holdPencilPensMarkersRarelyYes = 0;
    int holdPencilPensMarkersSometimesYes = 0;
    int holdPencilPensMarkersOftenYes = 0;
    int holdPencilPensMarkersVeryOftenYes = 0;

    int holdPencilPensMarkersNeverNo = 0;
    int holdPencilPensMarkersRarelyNo = 0;
    int holdPencilPensMarkersSometimesNo = 0;
    int holdPencilPensMarkersOftenNo = 0;
    int holdPencilPensMarkersVeryOftenNo = 0;

    int yourHandwriBadYouCantReadNeverYes = 0;
    int yourHandwriBadYouCantReadRarelyYes = 0;
    int yourHandwriBadYouCantReadSometimesYes = 0;
    int yourHandwriBadYouCantReadOftenYes = 0;
    int yourHandwriBadYouCantReadVeryOftenYes = 0;

    int yourHandwriBadYouCantReadNeverNo = 0;
    int yourHandwriBadYouCantReadRarelyNo = 0;
    int yourHandwriBadYouCantReadSometimesNo = 0;
    int yourHandwriBadYouCantReadOftenNo = 0;
    int yourHandwriBadYouCantReadVeryOftenNo = 0;

    int missLetterWordWriteTooQuickNeverYes = 0;
    int missLetterWordWriteTooQuickRarelyYes = 0;
    int missLetterWordWriteTooQuickSometimesYes = 0;
    int missLetterWordWriteTooQuickOftenYes = 0;
    int missLetterWordWriteTooQuickVeryOftenYes = 0;

    int missLetterWordWriteTooQuickNeverNo = 0;
    int missLetterWordWriteTooQuickRarelyNo = 0;
    int missLetterWordWriteTooQuickSometimesNo = 0;
    int missLetterWordWriteTooQuickOftenNo = 0;
    int missLetterWordWriteTooQuickVeryOftenNo = 0;

    int writeDrawHurtHandTiredNeverYes = 0;
    int writeDrawHurtHandTiredRarelyYes = 0;
    int writeDrawHurtHandTiredSometimesYes = 0;
    int writeDrawHurtHandTiredOftenYes = 0;
    int writeDrawHurtHandTiredVeryOftenYes = 0;

    int writeDrawHurtHandTiredNeverNo = 0;
    int writeDrawHurtHandTiredRarelyNo = 0;
    int writeDrawHurtHandTiredSometimesNo = 0;
    int writeDrawHurtHandTiredOftenNo = 0;
    int writeDrawHurtHandTiredVeryOftenNo = 0;

    int seemToDifficultyPickSmallObjectNeverYes = 0;
    int seemToDifficultyPickSmallObjectRarelyYes = 0;
    int seemToDifficultyPickSmallObjectSometimesYes = 0;
    int seemToDifficultyPickSmallObjectOftenYes = 0;
    int seemToDifficultyPickSmallObjectVeryOftenYes = 0;

    int seemToDifficultyPickSmallObjectNeverNo = 0;
    int seemToDifficultyPickSmallObjectRarelyNo = 0;
    int seemToDifficultyPickSmallObjectSometimesNo = 0;
    int seemToDifficultyPickSmallObjectOftenNo = 0;
    int seemToDifficultyPickSmallObjectVeryOftenNo = 0;

    int feelExcuseToWriteAssignmentWorkOrAtHomeNeverYes = 0;
    int feelExcuseToWriteAssignmentWorkOrAtHomeRarelyYes = 0;
    int feelExcuseToWriteAssignmentWorkOrAtHomeSometimesYes = 0;
    int feelExcuseToWriteAssignmentWorkOrAtHomeOftenYes = 0;
    int feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenYes = 0;

    int feelExcuseToWriteAssignmentWorkOrAtHomeNeverNo = 0;
    int feelExcuseToWriteAssignmentWorkOrAtHomeRarelyNo = 0;
    int feelExcuseToWriteAssignmentWorkOrAtHomeSometimesNo = 0;
    int feelExcuseToWriteAssignmentWorkOrAtHomeOftenNo = 0;
    int feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenNo = 0;

    int haveTroubleUseScissorsButtoningZippingZippersNeverYes = 0;
    int haveTroubleUseScissorsButtoningZippingZippersRarelyYes = 0;
    int haveTroubleUseScissorsButtoningZippingZippersSometimesYes = 0;
    int haveTroubleUseScissorsButtoningZippingZippersOftenYes = 0;
    int haveTroubleUseScissorsButtoningZippingZippersVeryOftenYes = 0;

    int haveTroubleUseScissorsButtoningZippingZippersNeverNo = 0;
    int haveTroubleUseScissorsButtoningZippingZippersRarelyNo = 0;
    int haveTroubleUseScissorsButtoningZippingZippersSometimesNo = 0;
    int haveTroubleUseScissorsButtoningZippingZippersOftenNo = 0;
    int haveTroubleUseScissorsButtoningZippingZippersVeryOftenNo = 0;

    int oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverYes = 0;
    int oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherRarelyYes = 0;
    int oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesYes = 0;
    int oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenYes = 0;
    int oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenYes = 0;

    int oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverNo = 0;
    int oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherRarelyNo = 0;
    int oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesNo = 0;
    int oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenNo = 0;
    int oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenNo = 0;

    int makeSpellingErrorsInCommonWordsWriteNeverYes = 0;
    int makeSpellingErrorsInCommonWordsWriteRarelyYes = 0;
    int makeSpellingErrorsInCommonWordsWriteSometimesYes = 0;
    int makeSpellingErrorsInCommonWordsWriteOftenYes = 0;
    int makeSpellingErrorsInCommonWordsWriteVeryOftenYes = 0;

    int makeSpellingErrorsInCommonWordsWriteNeverNo = 0;
    int makeSpellingErrorsInCommonWordsWriteRarelyNo = 0;
    int makeSpellingErrorsInCommonWordsWriteSometimesNo = 0;
    int makeSpellingErrorsInCommonWordsWriteOftenNo = 0;
    int makeSpellingErrorsInCommonWordsWriteVeryOftenNo = 0;

    int avoidWritingWhiteOrChartBoardsNeverYes = 0;
    int avoidWritingWhiteOrChartBoardsRarelyYes = 0;
    int avoidWritingWhiteOrChartBoardsSometimesYes = 0;
    int avoidWritingWhiteOrChartBoardsOftenYes = 0;
    int avoidWritingWhiteOrChartBoardsVeryOftenYes = 0;

    int avoidWritingWhiteOrChartBoardsNeverNo = 0;
    int avoidWritingWhiteOrChartBoardsRarelyNo = 0;
    int avoidWritingWhiteOrChartBoardsSometimesNo = 0;
    int avoidWritingWhiteOrChartBoardsOftenNo = 0;
    int avoidWritingWhiteOrChartBoardsVeryOftenNo = 0;

    int restlessWhenWritingMovingAroundGettingDistractedEasilyNeverYes = 0;
    int restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyYes = 0;
    int restlessWhenWritingMovingAroundGettingDistractedEasilySometimesYes = 0;
    int restlessWhenWritingMovingAroundGettingDistractedEasilyOftenYes = 0;
    int restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenYes = 0;

    int restlessWhenWritingMovingAroundGettingDistractedEasilyNeverNo = 0;
    int restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyNo = 0;
    int restlessWhenWritingMovingAroundGettingDistractedEasilySometimesNo = 0;
    int restlessWhenWritingMovingAroundGettingDistractedEasilyOftenNo = 0;
    int restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenNo = 0;

    int difficultyFollowRulesOfGrammerWritingNotSpeakingNeverYes = 0;
    int difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyYes = 0;
    int difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesYes = 0;
    int difficultyFollowRulesOfGrammerWritingNotSpeakingOftenYes = 0;
    int difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenYes = 0;

    int difficultyFollowRulesOfGrammerWritingNotSpeakingNeverNo = 0;
    int difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyNo = 0;
    int difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesNo = 0;
    int difficultyFollowRulesOfGrammerWritingNotSpeakingOftenNo = 0;
    int difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenNo = 0;

    int leaveCriticalFactsDetailsWhenWritingNeverYes = 0;
    int leaveCriticalFactsDetailsWhenWritingRarelyYes = 0;
    int leaveCriticalFactsDetailsWhenWritingSometimesYes = 0;
    int leaveCriticalFactsDetailsWhenWritingOftenYes = 0;
    int leaveCriticalFactsDetailsWhenWritingVeryOftenYes = 0;

    int leaveCriticalFactsDetailsWhenWritingNeverNo = 0;
    int leaveCriticalFactsDetailsWhenWritingRarelyNo = 0;
    int leaveCriticalFactsDetailsWhenWritingSometimesNo = 0;
    int leaveCriticalFactsDetailsWhenWritingOftenNo = 0;
    int leaveCriticalFactsDetailsWhenWritingVeryOftenNo = 0;

    int notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverYes = 0;
    int notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyYes = 0;
    int notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesYes = 0;
    int notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenYes = 0;
    int notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenYes = 0;

    int notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverNo = 0;
    int notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyNo = 0;
    int notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesNo = 0;
    int notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenNo = 0;
    int notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenNo = 0;

    /**
     * **Devide**
     */
    float haveDyslexiaYesDevide = 0, haveDyspraxiaYesDevide = 0, haveAdhdAddYesDevide = 0, haveAutismYesDevide = 0, haveNoYesDevide = 0;
    float haveDyslexiaNoDevide = 0, haveDyspraxiaNoDevide = 0, haveAdhdAddNoDevide = 0, haveAutismNoDevide = 0, haveNoNoDevide = 0;

    float holdPencilPensMarkersNeverYesDevide = 0, holdPencilPensMarkersRarelyYesDevide = 0, holdPencilPensMarkersSometimesYesDevide = 0, holdPencilPensMarkersOftenYesDevide = 0, holdPencilPensMarkersVeryOftenYesDevide = 0;
    float holdPencilPensMarkersNeverNoDevide = 0, holdPencilPensMarkersRarelyNoDevide = 0, holdPencilPensMarkersSometimesNoDevide = 0, holdPencilPensMarkersOftenNoDevide = 0, holdPencilPensMarkersVeryOftenNoDevide = 0;

    float yourHandwriBadYouCantReadNeverYesDevide = 0, yourHandwriBadYouCantReadRarelyYesDevide = 0, yourHandwriBadYouCantReadSometimesYesDevide = 0, yourHandwriBadYouCantReadOftenYesDevide = 0, yourHandwriBadYouCantReadVeryOftenYesDevide = 0;
    float yourHandwriBadYouCantReadNeverNoDevide = 0, yourHandwriBadYouCantReadRarelyNoDevide = 0, yourHandwriBadYouCantReadSometimesNoDevide = 0, yourHandwriBadYouCantReadOftenNoDevide = 0, yourHandwriBadYouCantReadVeryOftenNoDevide = 0;

    float missLetterWordWriteTooQuickNeverYesDevide = 0, missLetterWordWriteTooQuickRarelyYesDevide = 0, missLetterWordWriteTooQuickSometimesYesDevide = 0, missLetterWordWriteTooQuickOftenYesDevide = 0, missLetterWordWriteTooQuickVeryOftenYesDevide = 0;
    float missLetterWordWriteTooQuickNeverNoDevide = 0, missLetterWordWriteTooQuickRarelyNoDevide = 0, missLetterWordWriteTooQuickSometimesNoDevide = 0, missLetterWordWriteTooQuickOftenNoDevide = 0, missLetterWordWriteTooQuickVeryOftenNoDevide = 0;

    float writeDrawHurtHandTiredNeverYesDevide = 0, writeDrawHurtHandTiredRarelyYesDevide = 0, writeDrawHurtHandTiredSometimesYesDevide = 0, writeDrawHurtHandTiredOftenYesDevide = 0, writeDrawHurtHandTiredVeryOftenYesDevide = 0;
    float writeDrawHurtHandTiredNeverNoDevide = 0, writeDrawHurtHandTiredRarelyNoDevide = 0, writeDrawHurtHandTiredSometimesNoDevide = 0, writeDrawHurtHandTiredOftenNoDevide = 0, writeDrawHurtHandTiredVeryOftenNoDevide = 0;

    float seemToDifficultyPickSmallObjectNeverYesDevide = 0, seemToDifficultyPickSmallObjectRarelyYesDevide = 0, seemToDifficultyPickSmallObjectSometimesYesDevide = 0, seemToDifficultyPickSmallObjectOftenYesDevide = 0, seemToDifficultyPickSmallObjectVeryOftenYesDevide = 0;
    float seemToDifficultyPickSmallObjectNeverNoDevide = 0, seemToDifficultyPickSmallObjectRarelyNoDevide = 0, seemToDifficultyPickSmallObjectSometimesNoDevide = 0, seemToDifficultyPickSmallObjectOftenNoDevide = 0, seemToDifficultyPickSmallObjectVeryOftenNoDevide = 0;

    float feelExcuseToWriteAssignmentWorkOrAtHomeNeverYesDevide = 0, feelExcuseToWriteAssignmentWorkOrAtHomeRarelyYesDevide = 0, feelExcuseToWriteAssignmentWorkOrAtHomeSometimesYesDevide = 0, feelExcuseToWriteAssignmentWorkOrAtHomeOftenYesDevide = 0, feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenYesDevide = 0;
    float feelExcuseToWriteAssignmentWorkOrAtHomeNeverNoDevide = 0, feelExcuseToWriteAssignmentWorkOrAtHomeRarelyNoDevide = 0, feelExcuseToWriteAssignmentWorkOrAtHomeSometimesNoDevide = 0, feelExcuseToWriteAssignmentWorkOrAtHomeOftenNoDevide = 0, feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenNoDevide = 0;

    float haveTroubleUseScissorsButtoningZippingZippersNeverYesDevide = 0, haveTroubleUseScissorsButtoningZippingZippersRarelyYesDevide = 0, haveTroubleUseScissorsButtoningZippingZippersSometimesYesDevide = 0, haveTroubleUseScissorsButtoningZippingZippersOftenYesDevide = 0, haveTroubleUseScissorsButtoningZippingZippersVeryOftenYesDevide = 0;
    float haveTroubleUseScissorsButtoningZippingZippersNeverNoDevide = 0, haveTroubleUseScissorsButtoningZippingZippersRarelyNoDevide = 0, haveTroubleUseScissorsButtoningZippingZippersSometimesNoDevide = 0, haveTroubleUseScissorsButtoningZippingZippersOftenNoDevide = 0, haveTroubleUseScissorsButtoningZippingZippersVeryOftenNoDevide = 0;

    float oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverYesDevide = 0, oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherRarelyYesDevide = 0, oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesYesDevide = 0, oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenYesDevide = 0, oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenYesDevide = 0;
    float oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverNoDevide = 0, oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherRarelyNoDevide = 0, oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesNoDevide = 0, oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenNoDevide = 0, oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenNoDevide = 0;

    float makeSpellingErrorsInCommonWordsWriteNeverYesDevide = 0, makeSpellingErrorsInCommonWordsWriteRarelyYesDevide = 0, makeSpellingErrorsInCommonWordsWriteSometimesYesDevide = 0, makeSpellingErrorsInCommonWordsWriteOftenYesDevide = 0, makeSpellingErrorsInCommonWordsWriteVeryOftenYesDevide = 0;
    float makeSpellingErrorsInCommonWordsWriteNeverNoDevide = 0, makeSpellingErrorsInCommonWordsWriteRarelyNoDevide = 0, makeSpellingErrorsInCommonWordsWriteSometimesNoDevide = 0, makeSpellingErrorsInCommonWordsWriteOftenNoDevide = 0, makeSpellingErrorsInCommonWordsWriteVeryOftenNoDevide = 0;

    float avoidWritingWhiteOrChartBoardsNeverYesDevide = 0, avoidWritingWhiteOrChartBoardsRarelyYesDevide = 0, avoidWritingWhiteOrChartBoardsSometimesYesDevide = 0, avoidWritingWhiteOrChartBoardsOftenYesDevide = 0, avoidWritingWhiteOrChartBoardsVeryOftenYesDevide = 0;
    float avoidWritingWhiteOrChartBoardsNeverNoDevide = 0, avoidWritingWhiteOrChartBoardsRarelyNoDevide = 0, avoidWritingWhiteOrChartBoardsSometimesNoDevide = 0, avoidWritingWhiteOrChartBoardsOftenNoDevide = 0, avoidWritingWhiteOrChartBoardsVeryOftenNoDevide = 0;

    float restlessWhenWritingMovingAroundGettingDistractedEasilyNeverYesDevide = 0, restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyYesDevide = 0, restlessWhenWritingMovingAroundGettingDistractedEasilySometimesYesDevide = 0, restlessWhenWritingMovingAroundGettingDistractedEasilyOftenYesDevide = 0, restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenYesDevide = 0;
    float restlessWhenWritingMovingAroundGettingDistractedEasilyNeverNoDevide = 0, restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyNoDevide = 0, restlessWhenWritingMovingAroundGettingDistractedEasilySometimesNoDevide = 0, restlessWhenWritingMovingAroundGettingDistractedEasilyOftenNoDevide = 0, restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenNoDevide = 0;

    float difficultyFollowRulesOfGrammerWritingNotSpeakingNeverYesDevide = 0, difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyYesDevide = 0, difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesYesDevide = 0, difficultyFollowRulesOfGrammerWritingNotSpeakingOftenYesDevide = 0, difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenYesDevide = 0;
    float difficultyFollowRulesOfGrammerWritingNotSpeakingNeverNoDevide = 0, difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyNoDevide = 0, difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesNoDevide = 0, difficultyFollowRulesOfGrammerWritingNotSpeakingOftenNoDevide = 0, difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenNoDevide = 0;

    float leaveCriticalFactsDetailsWhenWritingNeverYesDevide = 0, leaveCriticalFactsDetailsWhenWritingRarelyYesDevide = 0, leaveCriticalFactsDetailsWhenWritingSometimesYesDevide = 0, leaveCriticalFactsDetailsWhenWritingOftenYesDevide = 0, leaveCriticalFactsDetailsWhenWritingVeryOftenYesDevide = 0;
    float leaveCriticalFactsDetailsWhenWritingNeverNoDevide = 0, leaveCriticalFactsDetailsWhenWritingRarelyNoDevide = 0, leaveCriticalFactsDetailsWhenWritingSometimesNoDevide = 0, leaveCriticalFactsDetailsWhenWritingOftenNoDevide = 0, leaveCriticalFactsDetailsWhenWritingVeryOftenNoDevide = 0;

    float notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverYesDevide = 0, notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyYesDevide = 0, notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesYesDevide = 0, notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenYesDevide = 0, notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenYesDevide = 0;
    float notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverNoDevide = 0, notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyNoDevide = 0, notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesNoDevide = 0, notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenNoDevide = 0, notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenNoDevide = 0;

    /**
     * double declaration *
     */
    double totalsumyes = 1, totalsumno = 1;

    void getData(String disease, String holdPPM, String handwriRead, String missLetters, String hurtWrit, String diffPickSmall,
                 String excusesWriAssi, String trouble, String opposite, String spelling, String whiteboard, String restless,
                 String diffRules, String leaveOut, String linedPaper) {
        try {

            totalNoOfRaw = 300;

            haveDyslexiaYes =55;
            haveDyspraxiaYes = 54;
            haveAdhdAddYes = 42;
            haveAutismYes = 48;
            haveNoYes = 44;

            haveDyslexiaNo = 47;
            haveDyspraxiaNo = 46;
            haveAdhdAddNo = 50;
            haveAutismNo = 53;
            haveNoNo = 52;


            holdPencilPensMarkersNeverYes = 23;
            holdPencilPensMarkersRarelyYes = 47;
            holdPencilPensMarkersSometimesYes = 33;
            holdPencilPensMarkersOftenYes = 38;
            holdPencilPensMarkersVeryOftenYes = 62;

            holdPencilPensMarkersNeverNo = 35;
            holdPencilPensMarkersRarelyNo = 45;
            holdPencilPensMarkersSometimesNo = 48;
            holdPencilPensMarkersOftenNo = 85;
            holdPencilPensMarkersVeryOftenNo = 75;



            yourHandwriBadYouCantReadNeverYes = 93;
            yourHandwriBadYouCantReadRarelyYes = 76;
            yourHandwriBadYouCantReadSometimesYes = 66;
            yourHandwriBadYouCantReadOftenYes = 65;
            yourHandwriBadYouCantReadVeryOftenYes = 45;

            yourHandwriBadYouCantReadNeverNo = 43;
            yourHandwriBadYouCantReadRarelyNo = 84;
            yourHandwriBadYouCantReadSometimesNo = 83;
            yourHandwriBadYouCantReadOftenNo = 76;
            yourHandwriBadYouCantReadVeryOftenNo = 56;

            missLetterWordWriteTooQuickNeverYes = 51;
            missLetterWordWriteTooQuickRarelyYes = 53;
            missLetterWordWriteTooQuickSometimesYes = 55;
            missLetterWordWriteTooQuickOftenYes = 54;
            missLetterWordWriteTooQuickVeryOftenYes = 67;

            missLetterWordWriteTooQuickNeverNo = 60;
            missLetterWordWriteTooQuickRarelyNo = 50;
            missLetterWordWriteTooQuickSometimesNo = 40;
            missLetterWordWriteTooQuickOftenNo = 39;
            missLetterWordWriteTooQuickVeryOftenNo = 30;

            writeDrawHurtHandTiredNeverYes = 69;
            writeDrawHurtHandTiredRarelyYes = 64;
            writeDrawHurtHandTiredSometimesYes = 65;
            writeDrawHurtHandTiredOftenYes = 45;
            writeDrawHurtHandTiredVeryOftenYes = 40;

            writeDrawHurtHandTiredNeverNo = 37;
            writeDrawHurtHandTiredRarelyNo = 26;
            writeDrawHurtHandTiredSometimesNo = 77;
            writeDrawHurtHandTiredOftenNo = 66;
            writeDrawHurtHandTiredVeryOftenNo = 55;

            seemToDifficultyPickSmallObjectNeverYes = 88;
            seemToDifficultyPickSmallObjectRarelyYes = 86;
            seemToDifficultyPickSmallObjectSometimesYes = 84;
            seemToDifficultyPickSmallObjectOftenYes = 80;
            seemToDifficultyPickSmallObjectVeryOftenYes = 18;

            seemToDifficultyPickSmallObjectNeverNo = 76;
            seemToDifficultyPickSmallObjectRarelyNo = 78;
            seemToDifficultyPickSmallObjectSometimesNo = 90;
            seemToDifficultyPickSmallObjectOftenNo = 95;
            seemToDifficultyPickSmallObjectVeryOftenNo = 56;

            feelExcuseToWriteAssignmentWorkOrAtHomeNeverYes = 46;
            feelExcuseToWriteAssignmentWorkOrAtHomeRarelyYes = 94;
            feelExcuseToWriteAssignmentWorkOrAtHomeSometimesYes = 93;
            feelExcuseToWriteAssignmentWorkOrAtHomeOftenYes = 92;
            feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenYes = 90;

            feelExcuseToWriteAssignmentWorkOrAtHomeNeverNo = 78;
            feelExcuseToWriteAssignmentWorkOrAtHomeRarelyNo = 65;
            feelExcuseToWriteAssignmentWorkOrAtHomeSometimesNo = 67;
            feelExcuseToWriteAssignmentWorkOrAtHomeOftenNo = 69;
            feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenNo = 75;

            haveTroubleUseScissorsButtoningZippingZippersNeverYes = 49;
            haveTroubleUseScissorsButtoningZippingZippersRarelyYes = 51;
            haveTroubleUseScissorsButtoningZippingZippersSometimesYes = 52;
            haveTroubleUseScissorsButtoningZippingZippersOftenYes = 55;
            haveTroubleUseScissorsButtoningZippingZippersVeryOftenYes = 78;

            haveTroubleUseScissorsButtoningZippingZippersNeverNo = 28;
            haveTroubleUseScissorsButtoningZippingZippersRarelyNo = 67;
            haveTroubleUseScissorsButtoningZippingZippersSometimesNo = 66;
            haveTroubleUseScissorsButtoningZippingZippersOftenNo = 74;
            haveTroubleUseScissorsButtoningZippingZippersVeryOftenNo = 77;

            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverYes = 56;
            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherRarelyYes = 48;
            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesYes = 96;
            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenYes = 92;
            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenYes = 95;

            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverNo = 49;
            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherRarelyNo = 51;
            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesNo = 52;
            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenNo = 55;
            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenNo = 67;

            makeSpellingErrorsInCommonWordsWriteNeverYes = 56;
            makeSpellingErrorsInCommonWordsWriteRarelyYes = 88;
            makeSpellingErrorsInCommonWordsWriteSometimesYes = 76;
            makeSpellingErrorsInCommonWordsWriteOftenYes = 74;
            makeSpellingErrorsInCommonWordsWriteVeryOftenYes = 73;

            makeSpellingErrorsInCommonWordsWriteNeverNo = 45;
            makeSpellingErrorsInCommonWordsWriteRarelyNo = 67;
            makeSpellingErrorsInCommonWordsWriteSometimesNo = 66;
            makeSpellingErrorsInCommonWordsWriteOftenNo = 67;
            makeSpellingErrorsInCommonWordsWriteVeryOftenNo = 77;

            avoidWritingWhiteOrChartBoardsNeverYes = 55;
            avoidWritingWhiteOrChartBoardsRarelyYes = 54;
            avoidWritingWhiteOrChartBoardsSometimesYes = 58;
            avoidWritingWhiteOrChartBoardsOftenYes = 67;
            avoidWritingWhiteOrChartBoardsVeryOftenYes = 69;

            avoidWritingWhiteOrChartBoardsNeverNo = 45;
            avoidWritingWhiteOrChartBoardsRarelyNo = 48;
            avoidWritingWhiteOrChartBoardsSometimesNo = 56;
            avoidWritingWhiteOrChartBoardsOftenNo = 77;
            avoidWritingWhiteOrChartBoardsVeryOftenNo = 77;

            restlessWhenWritingMovingAroundGettingDistractedEasilyNeverYes = 66;
            restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyYes = 74;
            restlessWhenWritingMovingAroundGettingDistractedEasilySometimesYes = 39;
            restlessWhenWritingMovingAroundGettingDistractedEasilyOftenYes = 38;
            restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenYes = 35;

            restlessWhenWritingMovingAroundGettingDistractedEasilyNeverNo = 66;
            restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyNo = 79;
            restlessWhenWritingMovingAroundGettingDistractedEasilySometimesNo = 88;
            restlessWhenWritingMovingAroundGettingDistractedEasilyOftenNo = 89;
            restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenNo = 74;

            difficultyFollowRulesOfGrammerWritingNotSpeakingNeverYes = 34;
            difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyYes = 66;
            difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesYes = 69;
            difficultyFollowRulesOfGrammerWritingNotSpeakingOftenYes = 21;
            difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenYes = 23;

            difficultyFollowRulesOfGrammerWritingNotSpeakingNeverNo = 25;
            difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyNo = 27;
            difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesNo = 29;
            difficultyFollowRulesOfGrammerWritingNotSpeakingOftenNo = 31;
            difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenNo = 33;

            leaveCriticalFactsDetailsWhenWritingNeverYes = 35;
            leaveCriticalFactsDetailsWhenWritingRarelyYes = 37;
            leaveCriticalFactsDetailsWhenWritingSometimesYes = 39;
            leaveCriticalFactsDetailsWhenWritingOftenYes = 41;
            leaveCriticalFactsDetailsWhenWritingVeryOftenYes = 43;

            leaveCriticalFactsDetailsWhenWritingNeverNo = 45;
            leaveCriticalFactsDetailsWhenWritingRarelyNo = 47;
            leaveCriticalFactsDetailsWhenWritingSometimesNo = 49;
            leaveCriticalFactsDetailsWhenWritingOftenNo = 51;
            leaveCriticalFactsDetailsWhenWritingVeryOftenNo = 53;

            notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverYes = 55;
            notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyYes = 57;
            notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesYes = 59;
            notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenYes = 61;
            notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenYes = 63;

            notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverNo = 65;
            notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyNo = 76;
            notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesNo = 67;
            notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenNo = 69;
            notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenNo = 71;

            /**
             * *Find classification**
             */
            haveDyslexiaYesDevide = (float) haveDyslexiaYes / totalNoOfRaw;
            haveDyslexiaNoDevide = (float) haveDyslexiaNo / totalNoOfRaw;

            haveDyspraxiaYesDevide = (float) haveDyspraxiaYes / totalNoOfRaw;
            haveDyspraxiaNoDevide = (float) haveDyspraxiaNo / totalNoOfRaw;

            haveAdhdAddYesDevide = (float) haveAdhdAddYes / totalNoOfRaw;
            haveAdhdAddNoDevide = (float) haveAdhdAddNo / totalNoOfRaw;

            haveAutismYesDevide = (float) haveAutismYes / totalNoOfRaw;
            haveAutismNoDevide = (float) haveAutismNo / totalNoOfRaw;

            haveNoYesDevide = (float) haveNoYes / totalNoOfRaw;
            haveNoNoDevide = (float) haveNoNo / totalNoOfRaw;

            holdPencilPensMarkersNeverYesDevide = (float) holdPencilPensMarkersNeverYes / totalNoOfRaw;
            holdPencilPensMarkersNeverNoDevide = (float) holdPencilPensMarkersNeverNo / totalNoOfRaw;

            holdPencilPensMarkersRarelyYesDevide = (float) holdPencilPensMarkersRarelyYes / totalNoOfRaw;
            holdPencilPensMarkersRarelyNoDevide = (float) holdPencilPensMarkersRarelyNo / totalNoOfRaw;

            holdPencilPensMarkersSometimesYesDevide = (float) holdPencilPensMarkersSometimesYes / totalNoOfRaw;
            holdPencilPensMarkersSometimesNoDevide = (float) holdPencilPensMarkersSometimesNo / totalNoOfRaw;

            holdPencilPensMarkersOftenYesDevide = (float) holdPencilPensMarkersOftenYes / totalNoOfRaw;
            holdPencilPensMarkersOftenNoDevide = (float) holdPencilPensMarkersOftenNo / totalNoOfRaw;

            holdPencilPensMarkersVeryOftenYesDevide = (float) holdPencilPensMarkersVeryOftenYes / totalNoOfRaw;
            holdPencilPensMarkersVeryOftenNoDevide = (float) holdPencilPensMarkersVeryOftenNo / totalNoOfRaw;

            yourHandwriBadYouCantReadNeverYesDevide = (float) yourHandwriBadYouCantReadNeverYes / totalNoOfRaw;
            yourHandwriBadYouCantReadNeverNoDevide = (float) yourHandwriBadYouCantReadNeverNo / totalNoOfRaw;

            yourHandwriBadYouCantReadRarelyYesDevide = (float) yourHandwriBadYouCantReadRarelyYes / totalNoOfRaw;
            yourHandwriBadYouCantReadRarelyNoDevide = (float) yourHandwriBadYouCantReadRarelyNo / totalNoOfRaw;

            yourHandwriBadYouCantReadSometimesYesDevide = (float) yourHandwriBadYouCantReadSometimesYes / totalNoOfRaw;
            yourHandwriBadYouCantReadSometimesNoDevide = (float) yourHandwriBadYouCantReadSometimesNo / totalNoOfRaw;

            yourHandwriBadYouCantReadOftenYesDevide = (float) yourHandwriBadYouCantReadOftenYes / totalNoOfRaw;
            yourHandwriBadYouCantReadOftenNoDevide = (float) yourHandwriBadYouCantReadOftenNo / totalNoOfRaw;

            yourHandwriBadYouCantReadVeryOftenYesDevide = (float) yourHandwriBadYouCantReadVeryOftenYes / totalNoOfRaw;
            yourHandwriBadYouCantReadVeryOftenNoDevide = (float) yourHandwriBadYouCantReadVeryOftenNo / totalNoOfRaw;

            missLetterWordWriteTooQuickNeverYesDevide = (float) missLetterWordWriteTooQuickNeverYes / totalNoOfRaw;
            missLetterWordWriteTooQuickNeverNoDevide = (float) missLetterWordWriteTooQuickNeverNo / totalNoOfRaw;

            missLetterWordWriteTooQuickRarelyYesDevide = (float) missLetterWordWriteTooQuickRarelyYes / totalNoOfRaw;
            missLetterWordWriteTooQuickRarelyNoDevide = (float) missLetterWordWriteTooQuickRarelyNo / totalNoOfRaw;

            missLetterWordWriteTooQuickSometimesYesDevide = (float) missLetterWordWriteTooQuickSometimesYes / totalNoOfRaw;
            missLetterWordWriteTooQuickSometimesNoDevide = (float) missLetterWordWriteTooQuickSometimesNo / totalNoOfRaw;

            missLetterWordWriteTooQuickOftenYesDevide = (float) missLetterWordWriteTooQuickOftenYes / totalNoOfRaw;
            missLetterWordWriteTooQuickOftenNoDevide = (float) missLetterWordWriteTooQuickOftenNo / totalNoOfRaw;

            missLetterWordWriteTooQuickVeryOftenYesDevide = (float) missLetterWordWriteTooQuickVeryOftenYes / totalNoOfRaw;
            missLetterWordWriteTooQuickVeryOftenNoDevide = (float) missLetterWordWriteTooQuickVeryOftenNo / totalNoOfRaw;

            writeDrawHurtHandTiredNeverYesDevide = (float) writeDrawHurtHandTiredNeverYes / totalNoOfRaw;
            writeDrawHurtHandTiredNeverNoDevide = (float) writeDrawHurtHandTiredNeverNo / totalNoOfRaw;

            writeDrawHurtHandTiredRarelyYesDevide = (float) writeDrawHurtHandTiredRarelyYes / totalNoOfRaw;
            writeDrawHurtHandTiredRarelyNoDevide = (float) writeDrawHurtHandTiredRarelyNo / totalNoOfRaw;

            writeDrawHurtHandTiredSometimesYesDevide = (float) writeDrawHurtHandTiredSometimesYes / totalNoOfRaw;
            writeDrawHurtHandTiredSometimesNoDevide = (float) writeDrawHurtHandTiredSometimesNo / totalNoOfRaw;

            writeDrawHurtHandTiredOftenYesDevide = (float) writeDrawHurtHandTiredOftenYes / totalNoOfRaw;
            writeDrawHurtHandTiredOftenNoDevide = (float) writeDrawHurtHandTiredOftenNo / totalNoOfRaw;

            writeDrawHurtHandTiredVeryOftenYesDevide = (float) writeDrawHurtHandTiredVeryOftenYes / totalNoOfRaw;
            writeDrawHurtHandTiredVeryOftenNoDevide = (float) writeDrawHurtHandTiredVeryOftenNo / totalNoOfRaw;

            seemToDifficultyPickSmallObjectNeverYesDevide = (float) seemToDifficultyPickSmallObjectNeverYes / totalNoOfRaw;
            seemToDifficultyPickSmallObjectNeverNoDevide = (float) seemToDifficultyPickSmallObjectNeverNo / totalNoOfRaw;

            seemToDifficultyPickSmallObjectRarelyYesDevide = (float) seemToDifficultyPickSmallObjectRarelyYes / totalNoOfRaw;
            seemToDifficultyPickSmallObjectRarelyNoDevide = (float) seemToDifficultyPickSmallObjectRarelyNo / totalNoOfRaw;

            seemToDifficultyPickSmallObjectSometimesYesDevide = (float) seemToDifficultyPickSmallObjectSometimesYes / totalNoOfRaw;
            seemToDifficultyPickSmallObjectSometimesNoDevide = (float) seemToDifficultyPickSmallObjectSometimesNo / totalNoOfRaw;

            seemToDifficultyPickSmallObjectOftenYesDevide = (float) seemToDifficultyPickSmallObjectOftenYes / totalNoOfRaw;
            seemToDifficultyPickSmallObjectOftenNoDevide = (float) seemToDifficultyPickSmallObjectOftenNo / totalNoOfRaw;

            seemToDifficultyPickSmallObjectVeryOftenYesDevide = (float) seemToDifficultyPickSmallObjectVeryOftenYes / totalNoOfRaw;
            seemToDifficultyPickSmallObjectVeryOftenNoDevide = (float) seemToDifficultyPickSmallObjectVeryOftenNo / totalNoOfRaw;

            feelExcuseToWriteAssignmentWorkOrAtHomeNeverYesDevide = (float) feelExcuseToWriteAssignmentWorkOrAtHomeNeverYes / totalNoOfRaw;
            feelExcuseToWriteAssignmentWorkOrAtHomeNeverNoDevide = (float) feelExcuseToWriteAssignmentWorkOrAtHomeNeverNo / totalNoOfRaw;

            feelExcuseToWriteAssignmentWorkOrAtHomeRarelyYesDevide = (float) feelExcuseToWriteAssignmentWorkOrAtHomeRarelyYes / totalNoOfRaw;
            feelExcuseToWriteAssignmentWorkOrAtHomeRarelyNoDevide = (float) feelExcuseToWriteAssignmentWorkOrAtHomeRarelyNo / totalNoOfRaw;

            feelExcuseToWriteAssignmentWorkOrAtHomeSometimesYesDevide = (float) feelExcuseToWriteAssignmentWorkOrAtHomeSometimesYes / totalNoOfRaw;
            feelExcuseToWriteAssignmentWorkOrAtHomeSometimesNoDevide = (float) feelExcuseToWriteAssignmentWorkOrAtHomeSometimesNo / totalNoOfRaw;

            feelExcuseToWriteAssignmentWorkOrAtHomeOftenYesDevide = (float) feelExcuseToWriteAssignmentWorkOrAtHomeOftenYes / totalNoOfRaw;
            feelExcuseToWriteAssignmentWorkOrAtHomeOftenNoDevide = (float) feelExcuseToWriteAssignmentWorkOrAtHomeOftenNo / totalNoOfRaw;

            feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenYesDevide = (float) feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenYes / totalNoOfRaw;
            feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenNoDevide = (float) feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenNo / totalNoOfRaw;

            haveTroubleUseScissorsButtoningZippingZippersNeverYesDevide = (float) haveTroubleUseScissorsButtoningZippingZippersNeverYes / totalNoOfRaw;
            haveTroubleUseScissorsButtoningZippingZippersNeverNoDevide = (float) haveTroubleUseScissorsButtoningZippingZippersNeverNo / totalNoOfRaw;

            haveTroubleUseScissorsButtoningZippingZippersRarelyYesDevide = (float) haveTroubleUseScissorsButtoningZippingZippersRarelyYes / totalNoOfRaw;
            haveTroubleUseScissorsButtoningZippingZippersRarelyNoDevide = (float) haveTroubleUseScissorsButtoningZippingZippersRarelyNo / totalNoOfRaw;

            haveTroubleUseScissorsButtoningZippingZippersSometimesYesDevide = (float) haveTroubleUseScissorsButtoningZippingZippersSometimesYes / totalNoOfRaw;
            haveTroubleUseScissorsButtoningZippingZippersSometimesNoDevide = (float) haveTroubleUseScissorsButtoningZippingZippersSometimesNo / totalNoOfRaw;

            haveTroubleUseScissorsButtoningZippingZippersOftenYesDevide = (float) haveTroubleUseScissorsButtoningZippingZippersOftenYes / totalNoOfRaw;
            haveTroubleUseScissorsButtoningZippingZippersOftenNoDevide = (float) haveTroubleUseScissorsButtoningZippingZippersOftenNo / totalNoOfRaw;

            haveTroubleUseScissorsButtoningZippingZippersVeryOftenYesDevide = (float) haveTroubleUseScissorsButtoningZippingZippersVeryOftenYes / totalNoOfRaw;
            haveTroubleUseScissorsButtoningZippingZippersVeryOftenNoDevide = (float) haveTroubleUseScissorsButtoningZippingZippersVeryOftenNo / totalNoOfRaw;

            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverYesDevide = (float) oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverYes / totalNoOfRaw;
            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverNoDevide = (float) oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverNo / totalNoOfRaw;

            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherRarelyYesDevide = (float) oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherRarelyYes / totalNoOfRaw;
            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherRarelyNoDevide = (float) oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverNo / totalNoOfRaw;

            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesYesDevide = (float) oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesYes / totalNoOfRaw;
            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesNoDevide = (float) oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesNo / totalNoOfRaw;

            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenYesDevide = (float) oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenYes / totalNoOfRaw;
            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenNoDevide = (float) oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenNo / totalNoOfRaw;

            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenYesDevide = (float) oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenYes / totalNoOfRaw;
            oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenNoDevide = (float) oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenNo / totalNoOfRaw;

            makeSpellingErrorsInCommonWordsWriteNeverYesDevide = (float) makeSpellingErrorsInCommonWordsWriteNeverYes / totalNoOfRaw;
            makeSpellingErrorsInCommonWordsWriteNeverNoDevide = (float) makeSpellingErrorsInCommonWordsWriteNeverNo / totalNoOfRaw;

            makeSpellingErrorsInCommonWordsWriteRarelyYesDevide = (float) makeSpellingErrorsInCommonWordsWriteRarelyYes / totalNoOfRaw;
            makeSpellingErrorsInCommonWordsWriteRarelyNoDevide = (float) makeSpellingErrorsInCommonWordsWriteRarelyNo / totalNoOfRaw;

            makeSpellingErrorsInCommonWordsWriteSometimesYesDevide = (float) makeSpellingErrorsInCommonWordsWriteSometimesYes / totalNoOfRaw;
            makeSpellingErrorsInCommonWordsWriteSometimesNoDevide = (float) makeSpellingErrorsInCommonWordsWriteSometimesNo / totalNoOfRaw;

            makeSpellingErrorsInCommonWordsWriteOftenYesDevide = (float) makeSpellingErrorsInCommonWordsWriteOftenYes / totalNoOfRaw;
            makeSpellingErrorsInCommonWordsWriteOftenNoDevide = (float) makeSpellingErrorsInCommonWordsWriteOftenNo / totalNoOfRaw;

            makeSpellingErrorsInCommonWordsWriteVeryOftenYesDevide = (float) makeSpellingErrorsInCommonWordsWriteVeryOftenYes / totalNoOfRaw;
            makeSpellingErrorsInCommonWordsWriteVeryOftenNoDevide = (float) makeSpellingErrorsInCommonWordsWriteVeryOftenNo / totalNoOfRaw;

            avoidWritingWhiteOrChartBoardsNeverYesDevide = (float) avoidWritingWhiteOrChartBoardsNeverYes / totalNoOfRaw;
            avoidWritingWhiteOrChartBoardsNeverNoDevide = (float) avoidWritingWhiteOrChartBoardsNeverNo / totalNoOfRaw;

            avoidWritingWhiteOrChartBoardsRarelyYesDevide = (float) avoidWritingWhiteOrChartBoardsRarelyYes / totalNoOfRaw;
            avoidWritingWhiteOrChartBoardsRarelyNoDevide = (float) avoidWritingWhiteOrChartBoardsRarelyNo / totalNoOfRaw;

            avoidWritingWhiteOrChartBoardsSometimesYesDevide = (float) avoidWritingWhiteOrChartBoardsSometimesYes / totalNoOfRaw;
            avoidWritingWhiteOrChartBoardsSometimesNoDevide = (float) avoidWritingWhiteOrChartBoardsSometimesNo / totalNoOfRaw;

            avoidWritingWhiteOrChartBoardsOftenYesDevide = (float) avoidWritingWhiteOrChartBoardsOftenYes / totalNoOfRaw;
            avoidWritingWhiteOrChartBoardsOftenNoDevide = (float) avoidWritingWhiteOrChartBoardsOftenNo / totalNoOfRaw;

            avoidWritingWhiteOrChartBoardsVeryOftenYesDevide = (float) avoidWritingWhiteOrChartBoardsVeryOftenYes / totalNoOfRaw;
            avoidWritingWhiteOrChartBoardsVeryOftenNoDevide = (float) avoidWritingWhiteOrChartBoardsVeryOftenNo / totalNoOfRaw;

            restlessWhenWritingMovingAroundGettingDistractedEasilyNeverYesDevide = (float) restlessWhenWritingMovingAroundGettingDistractedEasilyNeverYes / totalNoOfRaw;
            restlessWhenWritingMovingAroundGettingDistractedEasilyNeverNoDevide = (float) restlessWhenWritingMovingAroundGettingDistractedEasilyNeverNo / totalNoOfRaw;

            restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyYesDevide = (float) restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyYes / totalNoOfRaw;
            restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyNoDevide = (float) restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyNo / totalNoOfRaw;

            restlessWhenWritingMovingAroundGettingDistractedEasilySometimesYesDevide = (float) restlessWhenWritingMovingAroundGettingDistractedEasilySometimesYes / totalNoOfRaw;
            restlessWhenWritingMovingAroundGettingDistractedEasilySometimesNoDevide = (float) restlessWhenWritingMovingAroundGettingDistractedEasilySometimesNo / totalNoOfRaw;

            restlessWhenWritingMovingAroundGettingDistractedEasilyOftenYesDevide = (float) restlessWhenWritingMovingAroundGettingDistractedEasilyOftenYes / totalNoOfRaw;
            restlessWhenWritingMovingAroundGettingDistractedEasilyOftenNoDevide = (float) restlessWhenWritingMovingAroundGettingDistractedEasilyOftenNo / totalNoOfRaw;

            restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenYesDevide = (float) restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenYes / totalNoOfRaw;
            restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenNoDevide = (float) restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenNo / totalNoOfRaw;

            difficultyFollowRulesOfGrammerWritingNotSpeakingNeverYesDevide = (float) difficultyFollowRulesOfGrammerWritingNotSpeakingNeverYes / totalNoOfRaw;
            difficultyFollowRulesOfGrammerWritingNotSpeakingNeverNoDevide = (float) difficultyFollowRulesOfGrammerWritingNotSpeakingNeverNo / totalNoOfRaw;

            difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyYesDevide = (float) difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyYes / totalNoOfRaw;
            difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyNoDevide = (float) difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyNo / totalNoOfRaw;

            difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesYesDevide = (float) difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesYes / totalNoOfRaw;
            difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesNoDevide = (float) difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesNo / totalNoOfRaw;

            difficultyFollowRulesOfGrammerWritingNotSpeakingOftenYesDevide = (float) difficultyFollowRulesOfGrammerWritingNotSpeakingOftenYes / totalNoOfRaw;
            difficultyFollowRulesOfGrammerWritingNotSpeakingOftenNoDevide = (float) difficultyFollowRulesOfGrammerWritingNotSpeakingOftenNo / totalNoOfRaw;

            difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenYesDevide = (float) difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenYes / totalNoOfRaw;
            difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenNoDevide = (float) difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenNo / totalNoOfRaw;

            leaveCriticalFactsDetailsWhenWritingNeverYesDevide = (float) leaveCriticalFactsDetailsWhenWritingNeverYes / totalNoOfRaw;
            leaveCriticalFactsDetailsWhenWritingNeverNoDevide = (float) leaveCriticalFactsDetailsWhenWritingNeverNo / totalNoOfRaw;

            leaveCriticalFactsDetailsWhenWritingRarelyYesDevide = (float) leaveCriticalFactsDetailsWhenWritingRarelyYes / totalNoOfRaw;
            leaveCriticalFactsDetailsWhenWritingRarelyNoDevide = (float) leaveCriticalFactsDetailsWhenWritingRarelyNo / totalNoOfRaw;

            leaveCriticalFactsDetailsWhenWritingSometimesYesDevide = (float) leaveCriticalFactsDetailsWhenWritingSometimesYes / totalNoOfRaw;
            leaveCriticalFactsDetailsWhenWritingSometimesNoDevide = (float) leaveCriticalFactsDetailsWhenWritingSometimesNo / totalNoOfRaw;

            leaveCriticalFactsDetailsWhenWritingOftenYesDevide = (float) leaveCriticalFactsDetailsWhenWritingOftenYes / totalNoOfRaw;
            leaveCriticalFactsDetailsWhenWritingOftenNoDevide = (float) leaveCriticalFactsDetailsWhenWritingOftenNo / totalNoOfRaw;

            leaveCriticalFactsDetailsWhenWritingVeryOftenYesDevide = (float) leaveCriticalFactsDetailsWhenWritingVeryOftenYes / totalNoOfRaw;
            leaveCriticalFactsDetailsWhenWritingVeryOftenNoDevide = (float) leaveCriticalFactsDetailsWhenWritingVeryOftenNo / totalNoOfRaw;

            notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverYesDevide = (float) notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverYes / totalNoOfRaw;
            notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverNoDevide = (float) notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverNo / totalNoOfRaw;

            notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyYesDevide = (float) notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyYes / totalNoOfRaw;
            notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyNoDevide = (float) notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyNo / totalNoOfRaw;

            notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesYesDevide = (float) notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesYes / totalNoOfRaw;
            notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesNoDevide = (float) notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesNo / totalNoOfRaw;

            notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenYesDevide = (float) notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenYes / totalNoOfRaw;
            notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenNoDevide = (float) notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenNo / totalNoOfRaw;

            notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenYesDevide = (float) notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenYes / totalNoOfRaw;
            notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenNoDevide = (float) notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenNo / totalNoOfRaw;

            /**
             * if Conditions
             *
             */
            if (disease.equals("Dyslexia")) {
                if (haveDyslexiaYesDevide != 0) {
                    totalsumyes *= haveDyslexiaYesDevide;
                }
                if (haveDyslexiaNoDevide != 0) {
                    totalsumno *= haveDyslexiaNoDevide;
                }
            } else if (disease.equals("Dyspraxia")) {
                if (haveDyspraxiaYesDevide != 0) {
                    totalsumyes *= haveDyspraxiaYesDevide;
                }
                if (haveDyspraxiaNoDevide != 0) {
                    totalsumno *= haveDyspraxiaNoDevide;
                }
            } else if (disease.equals("ADHD/ADD")) {
                if (haveAdhdAddYesDevide != 0) {
                    totalsumyes *= haveAdhdAddYesDevide;
                }
                if (haveAdhdAddNoDevide != 0) {
                    totalsumno *= haveAdhdAddNoDevide;
                }

            } else if (disease.equals("Autism")) {
                if (haveAutismYesDevide != 0) {
                    totalsumyes *= haveAutismYesDevide;
                }
                if (haveAutismNoDevide != 0) {
                    totalsumno *= haveAutismNoDevide;
                }
            } else if (disease.equals("No")) {
                if (haveNoYesDevide != 0) {
                    totalsumyes *= haveNoYesDevide;
                }
                if (haveNoNoDevide != 0) {
                    totalsumno *= haveNoNoDevide;
                }
            }
            if (holdPPM.equals("Never")) {
                if (holdPencilPensMarkersNeverYesDevide != 0) {
                    totalsumyes *= holdPencilPensMarkersNeverYesDevide;
                }
                if (holdPencilPensMarkersNeverNoDevide != 0) {
                    totalsumno *= holdPencilPensMarkersNeverNoDevide;
                }
            } else if (holdPPM.equals("Rarely")) {
                if (holdPencilPensMarkersRarelyYesDevide != 0) {
                    totalsumyes *= holdPencilPensMarkersRarelyYesDevide;
                }
                if (holdPencilPensMarkersRarelyNoDevide != 0) {
                    totalsumno *= holdPencilPensMarkersRarelyNoDevide;
                }
            } else if (holdPPM.equals("Sometimes")) {
                if (holdPencilPensMarkersSometimesYesDevide != 0) {
                    totalsumyes *= holdPencilPensMarkersSometimesYesDevide;
                }
                if (holdPencilPensMarkersSometimesNoDevide != 0) {
                    totalsumno *= holdPencilPensMarkersSometimesNoDevide;
                }

            } else if (holdPPM.equals("Often")) {
                if (holdPencilPensMarkersOftenYesDevide != 0) {
                    totalsumyes *= holdPencilPensMarkersOftenYesDevide;
                }
                if (holdPencilPensMarkersOftenNoDevide != 0) {
                    totalsumno *= holdPencilPensMarkersOftenNoDevide;
                }
            } else if (holdPPM.equals("Very Often")) {
                if (holdPencilPensMarkersVeryOftenYesDevide != 0) {
                    totalsumyes *= holdPencilPensMarkersVeryOftenYesDevide;
                }
                if (holdPencilPensMarkersVeryOftenNoDevide != 0) {
                    totalsumno *= holdPencilPensMarkersVeryOftenNoDevide;
                }
            }
            if (handwriRead.equals("Never")) {
                if (yourHandwriBadYouCantReadNeverYesDevide != 0) {
                    totalsumyes *= yourHandwriBadYouCantReadNeverYesDevide;
                }
                if (yourHandwriBadYouCantReadNeverNoDevide != 0) {
                    totalsumno *= yourHandwriBadYouCantReadNeverNoDevide;
                }
            } else if (handwriRead.equals("Rarely")) {
                if (yourHandwriBadYouCantReadRarelyYesDevide != 0) {
                    totalsumyes *= yourHandwriBadYouCantReadRarelyYesDevide;
                }
                if (yourHandwriBadYouCantReadRarelyNoDevide != 0) {
                    totalsumno *= yourHandwriBadYouCantReadRarelyNoDevide;
                }
            } else if (handwriRead.equals("Sometimes")) {
                if (yourHandwriBadYouCantReadSometimesYesDevide != 0) {
                    totalsumyes *= yourHandwriBadYouCantReadSometimesYesDevide;
                }
                if (yourHandwriBadYouCantReadSometimesNoDevide != 0) {
                    totalsumno *= yourHandwriBadYouCantReadSometimesNoDevide;
                }

            } else if (handwriRead.equals("Often")) {
                if (yourHandwriBadYouCantReadOftenYesDevide != 0) {
                    totalsumyes *= yourHandwriBadYouCantReadOftenYesDevide;
                }
                if (yourHandwriBadYouCantReadOftenNoDevide != 0) {
                    totalsumno *= yourHandwriBadYouCantReadOftenNoDevide;
                }
            } else if (handwriRead.equals("Very Often")) {
                if (yourHandwriBadYouCantReadVeryOftenYesDevide != 0) {
                    totalsumyes *= yourHandwriBadYouCantReadVeryOftenYesDevide;
                }
                if (yourHandwriBadYouCantReadVeryOftenNoDevide != 0) {
                    totalsumno *= yourHandwriBadYouCantReadVeryOftenNoDevide;
                }
            }
            if (missLetters.equals("Never")) {
                if (missLetterWordWriteTooQuickNeverYesDevide != 0) {
                    totalsumyes *= missLetterWordWriteTooQuickNeverYesDevide;
                }
                if (missLetterWordWriteTooQuickNeverNoDevide != 0) {
                    totalsumno *= missLetterWordWriteTooQuickNeverNoDevide;
                }
            } else if (missLetters.equals("Rarely")) {
                if (missLetterWordWriteTooQuickRarelyYesDevide != 0) {
                    totalsumyes *= missLetterWordWriteTooQuickRarelyYesDevide;
                }
                if (missLetterWordWriteTooQuickRarelyNoDevide != 0) {
                    totalsumno *= missLetterWordWriteTooQuickRarelyNoDevide;
                }
            } else if (missLetters.equals("Sometimes")) {
                if (missLetterWordWriteTooQuickSometimesYesDevide != 0) {
                    totalsumyes *= missLetterWordWriteTooQuickSometimesYesDevide;
                }
                if (missLetterWordWriteTooQuickSometimesNoDevide != 0) {
                    totalsumno *= missLetterWordWriteTooQuickSometimesNoDevide;
                }

            } else if (missLetters.equals("Often")) {
                if (missLetterWordWriteTooQuickOftenYesDevide != 0) {
                    totalsumyes *= missLetterWordWriteTooQuickOftenYesDevide;
                }
                if (missLetterWordWriteTooQuickOftenNoDevide != 0) {
                    totalsumno *= missLetterWordWriteTooQuickOftenNoDevide;
                }
            } else if (missLetters.equals("Very Often")) {
                if (missLetterWordWriteTooQuickVeryOftenYesDevide != 0) {
                    totalsumyes *= missLetterWordWriteTooQuickVeryOftenYesDevide;
                }
                if (missLetterWordWriteTooQuickVeryOftenNoDevide != 0) {
                    totalsumno *= missLetterWordWriteTooQuickVeryOftenNoDevide;
                }
            }
            if (hurtWrit.equals("Never")) {
                if (writeDrawHurtHandTiredNeverYesDevide != 0) {
                    totalsumyes *= writeDrawHurtHandTiredNeverYesDevide;
                }
                if (writeDrawHurtHandTiredNeverNoDevide != 0) {
                    totalsumno *= writeDrawHurtHandTiredNeverNoDevide;
                }
            } else if (hurtWrit.equals("Rarely")) {
                if (writeDrawHurtHandTiredRarelyYesDevide != 0) {
                    totalsumyes *= writeDrawHurtHandTiredRarelyYesDevide;
                }
                if (writeDrawHurtHandTiredRarelyNoDevide != 0) {
                    totalsumno *= writeDrawHurtHandTiredRarelyNoDevide;
                }
            } else if (hurtWrit.equals("Sometimes")) {
                if (writeDrawHurtHandTiredSometimesYesDevide != 0) {
                    totalsumyes *= writeDrawHurtHandTiredSometimesYesDevide;
                }
                if (writeDrawHurtHandTiredSometimesNoDevide != 0) {
                    totalsumno *= writeDrawHurtHandTiredSometimesNoDevide;
                }

            } else if (hurtWrit.equals("Often")) {
                if (writeDrawHurtHandTiredOftenYesDevide != 0) {
                    totalsumyes *= writeDrawHurtHandTiredOftenYesDevide;
                }
                if (writeDrawHurtHandTiredOftenNoDevide != 0) {
                    totalsumno *= writeDrawHurtHandTiredOftenNoDevide;
                }
            } else if (hurtWrit.equals("Very Often")) {
                if (writeDrawHurtHandTiredVeryOftenYesDevide != 0) {
                    totalsumyes *= writeDrawHurtHandTiredVeryOftenYesDevide;
                }
                if (writeDrawHurtHandTiredVeryOftenNoDevide != 0) {
                    totalsumno *= writeDrawHurtHandTiredVeryOftenNoDevide;
                }
            }
            if (diffPickSmall.equals("Never")) {
                if (seemToDifficultyPickSmallObjectNeverYesDevide != 0) {
                    totalsumyes *= seemToDifficultyPickSmallObjectNeverYesDevide;
                }
                if (seemToDifficultyPickSmallObjectNeverNoDevide != 0) {
                    totalsumno *= seemToDifficultyPickSmallObjectNeverNoDevide;
                }
            } else if (diffPickSmall.equals("Rarely")) {
                if (seemToDifficultyPickSmallObjectRarelyYesDevide != 0) {
                    totalsumyes *= seemToDifficultyPickSmallObjectRarelyYesDevide;
                }
                if (seemToDifficultyPickSmallObjectRarelyNoDevide != 0) {
                    totalsumno *= seemToDifficultyPickSmallObjectRarelyNoDevide;
                }
            } else if (diffPickSmall.equals("Sometimes")) {
                if (seemToDifficultyPickSmallObjectSometimesYesDevide != 0) {
                    totalsumyes *= seemToDifficultyPickSmallObjectSometimesYesDevide;
                }
                if (seemToDifficultyPickSmallObjectSometimesNoDevide != 0) {
                    totalsumno *= seemToDifficultyPickSmallObjectSometimesNoDevide;
                }

            } else if (diffPickSmall.equals("Often")) {
                if (seemToDifficultyPickSmallObjectOftenYesDevide != 0) {
                    totalsumyes *= seemToDifficultyPickSmallObjectOftenYesDevide;
                }
                if (seemToDifficultyPickSmallObjectOftenNoDevide != 0) {
                    totalsumno *= seemToDifficultyPickSmallObjectOftenNoDevide;
                }
            } else if (diffPickSmall.equals("Very Often")) {
                if (seemToDifficultyPickSmallObjectVeryOftenYesDevide != 0) {
                    totalsumyes *= seemToDifficultyPickSmallObjectVeryOftenYesDevide;
                }
                if (seemToDifficultyPickSmallObjectVeryOftenNoDevide != 0) {
                    totalsumno *= seemToDifficultyPickSmallObjectVeryOftenNoDevide;
                }
            }
            if (excusesWriAssi.equals("Never")) {
                if (feelExcuseToWriteAssignmentWorkOrAtHomeNeverYesDevide != 0) {
                    totalsumyes *= feelExcuseToWriteAssignmentWorkOrAtHomeNeverYesDevide;
                }
                if (feelExcuseToWriteAssignmentWorkOrAtHomeNeverNoDevide != 0) {
                    totalsumno *= feelExcuseToWriteAssignmentWorkOrAtHomeNeverNoDevide;
                }
            } else if (excusesWriAssi.equals("Rarely")) {
                if (feelExcuseToWriteAssignmentWorkOrAtHomeRarelyYesDevide != 0) {
                    totalsumyes *= feelExcuseToWriteAssignmentWorkOrAtHomeRarelyYesDevide;
                }
                if (feelExcuseToWriteAssignmentWorkOrAtHomeRarelyNoDevide != 0) {
                    totalsumno *= feelExcuseToWriteAssignmentWorkOrAtHomeRarelyNoDevide;
                }
            } else if (excusesWriAssi.equals("Sometimes")) {
                if (feelExcuseToWriteAssignmentWorkOrAtHomeSometimesYesDevide != 0) {
                    totalsumyes *= feelExcuseToWriteAssignmentWorkOrAtHomeSometimesYesDevide;
                }
                if (feelExcuseToWriteAssignmentWorkOrAtHomeSometimesNoDevide != 0) {
                    totalsumno *= feelExcuseToWriteAssignmentWorkOrAtHomeSometimesNoDevide;
                }

            } else if (excusesWriAssi.equals("Often")) {
                if (feelExcuseToWriteAssignmentWorkOrAtHomeOftenYesDevide != 0) {
                    totalsumyes *= feelExcuseToWriteAssignmentWorkOrAtHomeOftenYesDevide;
                }
                if (feelExcuseToWriteAssignmentWorkOrAtHomeOftenNoDevide != 0) {
                    totalsumno *= feelExcuseToWriteAssignmentWorkOrAtHomeOftenNoDevide;
                }
            } else if (excusesWriAssi.equals("Very Often")) {
                if (feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenYesDevide != 0) {
                    totalsumyes *= feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenYesDevide;
                }
                if (feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenNoDevide != 0) {
                    totalsumno *= feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenNoDevide;
                }
            }
            if (trouble.equals("Never")) {
                if (haveTroubleUseScissorsButtoningZippingZippersNeverYesDevide != 0) {
                    totalsumyes *= haveTroubleUseScissorsButtoningZippingZippersNeverYesDevide;
                }
                if (haveTroubleUseScissorsButtoningZippingZippersNeverNoDevide != 0) {
                    totalsumno *= haveTroubleUseScissorsButtoningZippingZippersNeverNoDevide;
                }
            } else if (trouble.equals("Rarely")) {
                if (haveTroubleUseScissorsButtoningZippingZippersRarelyYesDevide != 0) {
                    totalsumyes *= haveTroubleUseScissorsButtoningZippingZippersRarelyYesDevide;
                }
                if (haveTroubleUseScissorsButtoningZippingZippersRarelyNoDevide != 0) {
                    totalsumno *= haveTroubleUseScissorsButtoningZippingZippersRarelyNoDevide;
                }
            } else if (trouble.equals("Sometimes")) {
                if (haveTroubleUseScissorsButtoningZippingZippersSometimesYesDevide != 0) {
                    totalsumyes *= haveTroubleUseScissorsButtoningZippingZippersSometimesYesDevide;
                }
                if (haveTroubleUseScissorsButtoningZippingZippersSometimesNoDevide != 0) {
                    totalsumno *= haveTroubleUseScissorsButtoningZippingZippersSometimesNoDevide;
                }

            } else if (trouble.equals("Often")) {
                if (haveTroubleUseScissorsButtoningZippingZippersOftenYesDevide != 0) {
                    totalsumyes *= haveTroubleUseScissorsButtoningZippingZippersOftenYesDevide;
                }
                if (haveTroubleUseScissorsButtoningZippingZippersOftenNoDevide != 0) {
                    totalsumno *= haveTroubleUseScissorsButtoningZippingZippersOftenNoDevide;
                }
            } else if (trouble.equals("Very Often")) {
                if (haveTroubleUseScissorsButtoningZippingZippersVeryOftenYesDevide != 0) {
                    totalsumyes *= haveTroubleUseScissorsButtoningZippingZippersVeryOftenYesDevide;
                }
                if (haveTroubleUseScissorsButtoningZippingZippersVeryOftenNoDevide != 0) {
                    totalsumno *= haveTroubleUseScissorsButtoningZippingZippersVeryOftenNoDevide;
                }
            }
            if (opposite.equals("Never")) {
                if (oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverYesDevide != 0) {
                    totalsumyes *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverYesDevide;
                }
                if (oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverNoDevide != 0) {
                    totalsumno *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverNoDevide;
                }
            } else if (opposite.equals("Rarely")) {
                if (oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherRarelyYesDevide != 0) {
                    totalsumyes *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherRarelyYesDevide;
                }
                if (oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherRarelyNoDevide != 0) {
                    totalsumno *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherRarelyNoDevide;
                }
            } else if (opposite.equals("Sometimes")) {
                if (oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesYesDevide != 0) {
                    totalsumyes *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesYesDevide;
                }
                if (oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesNoDevide != 0) {
                    totalsumno *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesNoDevide;
                }

            } else if (opposite.equals("Often")) {
                if (oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenYesDevide != 0) {
                    totalsumyes *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenYesDevide;
                }
                if (oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenNoDevide != 0) {
                    totalsumno *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenNoDevide;
                }
            } else if (opposite.equals("Very Often")) {
                if (oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenYesDevide != 0) {
                    totalsumyes *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenYesDevide;
                }
                if (oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenNoDevide != 0) {
                    totalsumno *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenNoDevide;
                }
            }
            if (spelling.equals("Never")) {
                if (makeSpellingErrorsInCommonWordsWriteNeverYesDevide != 0) {
                    totalsumyes *= makeSpellingErrorsInCommonWordsWriteNeverYesDevide;
                }
                if (makeSpellingErrorsInCommonWordsWriteNeverNoDevide != 0) {
                    totalsumno *= makeSpellingErrorsInCommonWordsWriteNeverNoDevide;
                }
            } else if (spelling.equals("Rarely")) {
                if (makeSpellingErrorsInCommonWordsWriteRarelyYesDevide != 0) {
                    totalsumyes *= makeSpellingErrorsInCommonWordsWriteRarelyYesDevide;
                }
                if (makeSpellingErrorsInCommonWordsWriteRarelyNoDevide != 0) {
                    totalsumno *= makeSpellingErrorsInCommonWordsWriteRarelyNoDevide;
                }
            } else if (spelling.equals("Sometimes")) {
                if (makeSpellingErrorsInCommonWordsWriteSometimesYesDevide != 0) {
                    totalsumyes *= makeSpellingErrorsInCommonWordsWriteSometimesYesDevide;
                }
                if (makeSpellingErrorsInCommonWordsWriteSometimesNoDevide != 0) {
                    totalsumno *= makeSpellingErrorsInCommonWordsWriteSometimesNoDevide;
                }

            } else if (spelling.equals("Often")) {
                if (makeSpellingErrorsInCommonWordsWriteOftenYesDevide != 0) {
                    totalsumyes *= makeSpellingErrorsInCommonWordsWriteOftenYesDevide;
                }
                if (makeSpellingErrorsInCommonWordsWriteOftenNoDevide != 0) {
                    totalsumno *= makeSpellingErrorsInCommonWordsWriteOftenNoDevide;
                }
            } else if (spelling.equals("Very Often")) {
                if (makeSpellingErrorsInCommonWordsWriteVeryOftenYesDevide != 0) {
                    totalsumyes *= makeSpellingErrorsInCommonWordsWriteVeryOftenYesDevide;
                }
                if (makeSpellingErrorsInCommonWordsWriteVeryOftenNoDevide != 0) {
                    totalsumno *= makeSpellingErrorsInCommonWordsWriteVeryOftenNoDevide;
                }
            }
            if (whiteboard.equals("Never")) {
                if (avoidWritingWhiteOrChartBoardsNeverYesDevide != 0) {
                    totalsumyes *= avoidWritingWhiteOrChartBoardsNeverYesDevide;
                }
                if (avoidWritingWhiteOrChartBoardsNeverNoDevide != 0) {
                    totalsumno *= avoidWritingWhiteOrChartBoardsNeverNoDevide;
                }
            } else if (whiteboard.equals("Rarely")) {
                if (avoidWritingWhiteOrChartBoardsRarelyYesDevide != 0) {
                    totalsumyes *= avoidWritingWhiteOrChartBoardsRarelyYesDevide;
                }
                if (avoidWritingWhiteOrChartBoardsRarelyNoDevide != 0) {
                    totalsumno *= avoidWritingWhiteOrChartBoardsRarelyNoDevide;
                }
            } else if (whiteboard.equals("Sometimes")) {
                if (avoidWritingWhiteOrChartBoardsSometimesYesDevide != 0) {
                    totalsumyes *= avoidWritingWhiteOrChartBoardsSometimesYesDevide;
                }
                if (avoidWritingWhiteOrChartBoardsSometimesNoDevide != 0) {
                    totalsumno *= avoidWritingWhiteOrChartBoardsSometimesNoDevide;
                }

            } else if (whiteboard.equals("Often")) {
                if (avoidWritingWhiteOrChartBoardsOftenYesDevide != 0) {
                    totalsumyes *= avoidWritingWhiteOrChartBoardsOftenYesDevide;
                }
                if (avoidWritingWhiteOrChartBoardsOftenNoDevide != 0) {
                    totalsumno *= avoidWritingWhiteOrChartBoardsOftenNoDevide;
                }
            } else if (whiteboard.equals("Very Often")) {
                if (avoidWritingWhiteOrChartBoardsVeryOftenYesDevide != 0) {
                    totalsumyes *= avoidWritingWhiteOrChartBoardsVeryOftenYesDevide;
                }
                if (avoidWritingWhiteOrChartBoardsVeryOftenNoDevide != 0) {
                    totalsumno *= avoidWritingWhiteOrChartBoardsVeryOftenNoDevide;
                }
            }
            if (restless.equals("Never")) {
                if (restlessWhenWritingMovingAroundGettingDistractedEasilyNeverYesDevide != 0) {
                    totalsumyes *= restlessWhenWritingMovingAroundGettingDistractedEasilyNeverYesDevide;
                }
                if (restlessWhenWritingMovingAroundGettingDistractedEasilyNeverNoDevide != 0) {
                    totalsumno *= restlessWhenWritingMovingAroundGettingDistractedEasilyNeverNoDevide;
                }
            } else if (restless.equals("Rarely")) {
                if (restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyYesDevide != 0) {
                    totalsumyes *= restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyYesDevide;
                }
                if (restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyNoDevide != 0) {
                    totalsumno *= restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyNoDevide;
                }
            } else if (restless.equals("Sometimes")) {
                if (restlessWhenWritingMovingAroundGettingDistractedEasilySometimesYesDevide != 0) {
                    totalsumyes *= restlessWhenWritingMovingAroundGettingDistractedEasilySometimesYesDevide;
                }
                if (restlessWhenWritingMovingAroundGettingDistractedEasilySometimesNoDevide != 0) {
                    totalsumno *= restlessWhenWritingMovingAroundGettingDistractedEasilySometimesNoDevide;
                }

            } else if (restless.equals("Often")) {
                if (restlessWhenWritingMovingAroundGettingDistractedEasilyOftenYesDevide != 0) {
                    totalsumyes *= restlessWhenWritingMovingAroundGettingDistractedEasilyOftenYesDevide;
                }
                if (restlessWhenWritingMovingAroundGettingDistractedEasilyOftenNoDevide != 0) {
                    totalsumno *= restlessWhenWritingMovingAroundGettingDistractedEasilyOftenNoDevide;
                }
            } else if (restless.equals("Very Often")) {
                if (restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenYesDevide != 0) {
                    totalsumyes *= restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenYesDevide;
                }
                if (restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenNoDevide != 0) {
                    totalsumno *= restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenNoDevide;
                }
            }
            if (diffRules.equals("Never")) {
                if (difficultyFollowRulesOfGrammerWritingNotSpeakingNeverYesDevide != 0) {
                    totalsumyes *= difficultyFollowRulesOfGrammerWritingNotSpeakingNeverYesDevide;
                }
                if (difficultyFollowRulesOfGrammerWritingNotSpeakingNeverNoDevide != 0) {
                    totalsumno *= difficultyFollowRulesOfGrammerWritingNotSpeakingNeverNoDevide;
                }
            } else if (diffRules.equals("Rarely")) {
                if (difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyYesDevide != 0) {
                    totalsumyes *= difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyYesDevide;
                }
                if (difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyNoDevide != 0) {
                    totalsumno *= difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyNoDevide;
                }
            } else if (diffRules.equals("Sometimes")) {
                if (difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesYesDevide != 0) {
                    totalsumyes *= difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesYesDevide;
                }
                if (difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesNoDevide != 0) {
                    totalsumno *= difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesNoDevide;
                }

            } else if (diffRules.equals("Often")) {
                if (difficultyFollowRulesOfGrammerWritingNotSpeakingOftenYesDevide != 0) {
                    totalsumyes *= difficultyFollowRulesOfGrammerWritingNotSpeakingOftenYesDevide;
                }
                if (difficultyFollowRulesOfGrammerWritingNotSpeakingOftenNoDevide != 0) {
                    totalsumno *= difficultyFollowRulesOfGrammerWritingNotSpeakingOftenNoDevide;
                }
            } else if (diffRules.equals("Very Often")) {
                if (difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenYesDevide != 0) {
                    totalsumyes *= difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenYesDevide;
                }
                if (difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenNoDevide != 0) {
                    totalsumno *= difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenNoDevide;
                }
            }
            if (leaveOut.equals("Never")) {
                if (leaveCriticalFactsDetailsWhenWritingNeverYesDevide != 0) {
                    totalsumyes *= leaveCriticalFactsDetailsWhenWritingNeverYesDevide;
                }
                if (leaveCriticalFactsDetailsWhenWritingNeverNoDevide != 0) {
                    totalsumno *= leaveCriticalFactsDetailsWhenWritingNeverNoDevide;
                }
            } else if (leaveOut.equals("Rarely")) {
                if (leaveCriticalFactsDetailsWhenWritingRarelyYesDevide != 0) {
                    totalsumyes *= leaveCriticalFactsDetailsWhenWritingRarelyYesDevide;
                }
                if (leaveCriticalFactsDetailsWhenWritingRarelyNoDevide != 0) {
                    totalsumno *= leaveCriticalFactsDetailsWhenWritingRarelyNoDevide;
                }
            } else if (leaveOut.equals("Sometimes")) {
                if (leaveCriticalFactsDetailsWhenWritingSometimesYesDevide != 0) {
                    totalsumyes *= leaveCriticalFactsDetailsWhenWritingSometimesYesDevide;
                }
                if (leaveCriticalFactsDetailsWhenWritingSometimesNoDevide != 0) {
                    totalsumno *= leaveCriticalFactsDetailsWhenWritingSometimesNoDevide;
                }

            } else if (leaveOut.equals("Often")) {
                if (leaveCriticalFactsDetailsWhenWritingOftenYesDevide != 0) {
                    totalsumyes *= leaveCriticalFactsDetailsWhenWritingOftenYesDevide;
                }
                if (leaveCriticalFactsDetailsWhenWritingOftenNoDevide != 0) {
                    totalsumno *= leaveCriticalFactsDetailsWhenWritingOftenNoDevide;
                }
            } else if (leaveOut.equals("Very Often")) {
                if (leaveCriticalFactsDetailsWhenWritingVeryOftenYesDevide != 0) {
                    totalsumyes *= leaveCriticalFactsDetailsWhenWritingVeryOftenYesDevide;
                }
                if (leaveCriticalFactsDetailsWhenWritingVeryOftenNoDevide != 0) {
                    totalsumno *= leaveCriticalFactsDetailsWhenWritingVeryOftenNoDevide;
                }
            }
            if (linedPaper.equals("Never")) {
                if (notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverYesDevide != 0) {
                    totalsumyes *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverYesDevide;
                }
                if (notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverNoDevide != 0) {
                    totalsumno *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverNoDevide;
                }
            } else if (linedPaper.equals("Rarely")) {
                if (notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyYesDevide != 0) {
                    totalsumyes *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyYesDevide;
                }
                if (notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyNoDevide != 0) {
                    totalsumno *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyNoDevide;
                }
            } else if (linedPaper.equals("Sometimes")) {
                if (notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesYesDevide != 0) {
                    totalsumyes *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesYesDevide;
                }
                if (notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesNoDevide != 0) {
                    totalsumno *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesNoDevide;
                }

            } else if (linedPaper.equals("Often")) {
                if (notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenYesDevide != 0) {
                    totalsumyes *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenYesDevide;
                }
                if (notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenNoDevide != 0) {
                    totalsumno *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenNoDevide;
                }
            } else if (linedPaper.equals("Very Often")) {
                if (notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenYesDevide != 0) {
                    totalsumyes *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenYesDevide;
                }
                if (notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenNoDevide != 0) {
                    totalsumno *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenNoDevide;
                }
            }
            /**
             * *
             * Total sum of Yes and No *
             */
            totalsumyes *= haveDyslexiaYesDevide;
            totalsumno *= haveDyslexiaNoDevide;

            totalsumyes *= haveDyspraxiaYesDevide;
            totalsumno *= haveDyspraxiaNoDevide;

            totalsumyes *= haveAdhdAddYesDevide;
            totalsumno *= haveAdhdAddNoDevide;

            totalsumyes *= haveAutismYesDevide;
            totalsumno *= haveAutismNoDevide;

            totalsumyes *= haveNoYesDevide;
            totalsumno *= haveNoNoDevide;

            totalsumyes *= holdPencilPensMarkersNeverYesDevide;
            totalsumno *= holdPencilPensMarkersNeverNoDevide;

            totalsumyes *= holdPencilPensMarkersRarelyYesDevide;
            totalsumno *= holdPencilPensMarkersRarelyNoDevide;

            totalsumyes *= holdPencilPensMarkersSometimesYesDevide;
            totalsumno *= holdPencilPensMarkersSometimesNoDevide;

            totalsumyes *= holdPencilPensMarkersOftenYesDevide;
            totalsumno *= holdPencilPensMarkersOftenNoDevide;

            totalsumyes *= holdPencilPensMarkersVeryOftenYesDevide;
            totalsumno *= holdPencilPensMarkersVeryOftenNoDevide;

            totalsumyes *= yourHandwriBadYouCantReadNeverYesDevide;
            totalsumno *= yourHandwriBadYouCantReadNeverNoDevide;

            totalsumyes *= yourHandwriBadYouCantReadRarelyYesDevide;
            totalsumno *= yourHandwriBadYouCantReadRarelyNoDevide;

            totalsumyes *= yourHandwriBadYouCantReadSometimesYesDevide;
            totalsumno *= yourHandwriBadYouCantReadSometimesNoDevide;

            totalsumyes *= yourHandwriBadYouCantReadOftenYesDevide;
            totalsumno *= yourHandwriBadYouCantReadOftenNoDevide;

            totalsumyes *= yourHandwriBadYouCantReadVeryOftenYesDevide;
            totalsumno *= yourHandwriBadYouCantReadVeryOftenNoDevide;

            totalsumyes *= missLetterWordWriteTooQuickNeverYesDevide;
            totalsumno *= missLetterWordWriteTooQuickNeverNoDevide;

            totalsumyes *= missLetterWordWriteTooQuickRarelyYesDevide;
            totalsumno *= missLetterWordWriteTooQuickRarelyNoDevide;

            totalsumyes *= missLetterWordWriteTooQuickSometimesYesDevide;
            totalsumno *= missLetterWordWriteTooQuickSometimesNoDevide;

            totalsumyes *= missLetterWordWriteTooQuickOftenYesDevide;
            totalsumno *= missLetterWordWriteTooQuickOftenNoDevide;

            totalsumyes *= missLetterWordWriteTooQuickVeryOftenYesDevide;
            totalsumno *= missLetterWordWriteTooQuickVeryOftenNoDevide;

            totalsumyes *= writeDrawHurtHandTiredNeverYesDevide;
            totalsumno *= writeDrawHurtHandTiredNeverNoDevide;

            totalsumyes *= writeDrawHurtHandTiredRarelyYesDevide;
            totalsumno *= writeDrawHurtHandTiredRarelyNoDevide;

            totalsumyes *= writeDrawHurtHandTiredSometimesYesDevide;
            totalsumno *= writeDrawHurtHandTiredSometimesNoDevide;

            totalsumyes *= writeDrawHurtHandTiredOftenYesDevide;
            totalsumno *= writeDrawHurtHandTiredOftenNoDevide;

            totalsumyes *= writeDrawHurtHandTiredVeryOftenYesDevide;
            totalsumno *= writeDrawHurtHandTiredVeryOftenNoDevide;

            totalsumyes *= seemToDifficultyPickSmallObjectNeverYesDevide;
            totalsumno *= seemToDifficultyPickSmallObjectNeverNoDevide;

            totalsumyes *= seemToDifficultyPickSmallObjectRarelyYesDevide;
            totalsumno *= seemToDifficultyPickSmallObjectRarelyNoDevide;

            totalsumyes *= seemToDifficultyPickSmallObjectSometimesYesDevide;
            totalsumno *= seemToDifficultyPickSmallObjectSometimesNoDevide;

            totalsumyes *= seemToDifficultyPickSmallObjectOftenYesDevide;
            totalsumno *= seemToDifficultyPickSmallObjectOftenNoDevide;

            totalsumyes *= seemToDifficultyPickSmallObjectVeryOftenYesDevide;
            totalsumno *= seemToDifficultyPickSmallObjectVeryOftenNoDevide;

            totalsumyes *= feelExcuseToWriteAssignmentWorkOrAtHomeNeverYesDevide;
            totalsumno *= feelExcuseToWriteAssignmentWorkOrAtHomeNeverNoDevide;

            totalsumyes *= feelExcuseToWriteAssignmentWorkOrAtHomeRarelyYesDevide;
            totalsumno *= feelExcuseToWriteAssignmentWorkOrAtHomeRarelyNoDevide;

            totalsumyes *= feelExcuseToWriteAssignmentWorkOrAtHomeSometimesYesDevide;
            totalsumno *= feelExcuseToWriteAssignmentWorkOrAtHomeSometimesNoDevide;

            totalsumyes *= feelExcuseToWriteAssignmentWorkOrAtHomeOftenYesDevide;
            totalsumno *= feelExcuseToWriteAssignmentWorkOrAtHomeOftenNoDevide;

            totalsumyes *= feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenYesDevide;
            totalsumno *= feelExcuseToWriteAssignmentWorkOrAtHomeVeryOftenNoDevide;

            totalsumyes *= haveTroubleUseScissorsButtoningZippingZippersNeverYesDevide;
            totalsumno *= haveTroubleUseScissorsButtoningZippingZippersNeverNoDevide;

            totalsumyes *= haveTroubleUseScissorsButtoningZippingZippersRarelyYesDevide;
            totalsumno *= haveTroubleUseScissorsButtoningZippingZippersRarelyNoDevide;

            totalsumyes *= haveTroubleUseScissorsButtoningZippingZippersSometimesYesDevide;
            totalsumno *= haveTroubleUseScissorsButtoningZippingZippersSometimesNoDevide;

            totalsumyes *= haveTroubleUseScissorsButtoningZippingZippersOftenYesDevide;
            totalsumno *= haveTroubleUseScissorsButtoningZippingZippersOftenNoDevide;

            totalsumyes *= haveTroubleUseScissorsButtoningZippingZippersVeryOftenYesDevide;
            totalsumno *= haveTroubleUseScissorsButtoningZippingZippersVeryOftenNoDevide;

            totalsumyes *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverYesDevide;
            totalsumno *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherNeverNoDevide;

            totalsumyes *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherRarelyYesDevide;
            totalsumno *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherRarelyNoDevide;

            totalsumyes *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesYesDevide;
            totalsumno *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherSometimesNoDevide;

            totalsumyes *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenYesDevide;
            totalsumno *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherOftenNoDevide;

            totalsumyes *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenYesDevide;
            totalsumno *= oppositeArmsHandSeemToMoveOutOfSyncWithOneAnotherVeryOftenNoDevide;

            totalsumyes *= makeSpellingErrorsInCommonWordsWriteNeverYesDevide;
            totalsumno *= makeSpellingErrorsInCommonWordsWriteNeverNoDevide;

            totalsumyes *= makeSpellingErrorsInCommonWordsWriteRarelyYesDevide;
            totalsumno *= makeSpellingErrorsInCommonWordsWriteRarelyNoDevide;

            totalsumyes *= makeSpellingErrorsInCommonWordsWriteSometimesYesDevide;
            totalsumno *= makeSpellingErrorsInCommonWordsWriteSometimesNoDevide;

            totalsumyes *= makeSpellingErrorsInCommonWordsWriteOftenYesDevide;
            totalsumno *= makeSpellingErrorsInCommonWordsWriteOftenNoDevide;

            totalsumyes *= makeSpellingErrorsInCommonWordsWriteVeryOftenYesDevide;
            totalsumno *= makeSpellingErrorsInCommonWordsWriteVeryOftenNoDevide;

            totalsumyes *= avoidWritingWhiteOrChartBoardsNeverYesDevide;
            totalsumno *= avoidWritingWhiteOrChartBoardsNeverNoDevide;

            totalsumyes *= avoidWritingWhiteOrChartBoardsRarelyYesDevide;
            totalsumno *= avoidWritingWhiteOrChartBoardsRarelyNoDevide;

            totalsumyes *= avoidWritingWhiteOrChartBoardsSometimesYesDevide;
            totalsumno *= avoidWritingWhiteOrChartBoardsSometimesNoDevide;

            totalsumyes *= avoidWritingWhiteOrChartBoardsOftenYesDevide;
            totalsumno *= avoidWritingWhiteOrChartBoardsOftenNoDevide;

            totalsumyes *= avoidWritingWhiteOrChartBoardsVeryOftenYesDevide;
            totalsumno *= avoidWritingWhiteOrChartBoardsVeryOftenNoDevide;

            totalsumyes *= restlessWhenWritingMovingAroundGettingDistractedEasilyNeverYesDevide;
            totalsumno *= restlessWhenWritingMovingAroundGettingDistractedEasilyNeverNoDevide;

            totalsumyes *= restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyYesDevide;
            totalsumno *= restlessWhenWritingMovingAroundGettingDistractedEasilyRarelyNoDevide;

            totalsumyes *= restlessWhenWritingMovingAroundGettingDistractedEasilySometimesYesDevide;
            totalsumno *= restlessWhenWritingMovingAroundGettingDistractedEasilySometimesNoDevide;

            totalsumyes *= restlessWhenWritingMovingAroundGettingDistractedEasilyOftenYesDevide;
            totalsumno *= restlessWhenWritingMovingAroundGettingDistractedEasilyOftenNoDevide;

            totalsumyes *= restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenYesDevide;
            totalsumno *= restlessWhenWritingMovingAroundGettingDistractedEasilyVeryOftenNoDevide;

            totalsumyes *= difficultyFollowRulesOfGrammerWritingNotSpeakingNeverYesDevide;
            totalsumno *= difficultyFollowRulesOfGrammerWritingNotSpeakingNeverNoDevide;

            totalsumyes *= difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyYesDevide;
            totalsumno *= difficultyFollowRulesOfGrammerWritingNotSpeakingRarelyNoDevide;

            totalsumyes *= difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesYesDevide;
            totalsumno *= difficultyFollowRulesOfGrammerWritingNotSpeakingSometimesNoDevide;

            totalsumyes *= difficultyFollowRulesOfGrammerWritingNotSpeakingOftenYesDevide;
            totalsumno *= difficultyFollowRulesOfGrammerWritingNotSpeakingOftenNoDevide;

            totalsumyes *= difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenYesDevide;
            totalsumno *= difficultyFollowRulesOfGrammerWritingNotSpeakingVeryOftenNoDevide;

            totalsumyes *= leaveCriticalFactsDetailsWhenWritingNeverYesDevide;
            totalsumno *= leaveCriticalFactsDetailsWhenWritingNeverNoDevide;

            totalsumyes *= leaveCriticalFactsDetailsWhenWritingRarelyYesDevide;
            totalsumno *= leaveCriticalFactsDetailsWhenWritingRarelyNoDevide;

            totalsumyes *= leaveCriticalFactsDetailsWhenWritingSometimesYesDevide;
            totalsumno *= leaveCriticalFactsDetailsWhenWritingSometimesNoDevide;

            totalsumyes *= leaveCriticalFactsDetailsWhenWritingOftenYesDevide;
            totalsumno *= leaveCriticalFactsDetailsWhenWritingOftenNoDevide;

            totalsumyes *= leaveCriticalFactsDetailsWhenWritingVeryOftenYesDevide;
            totalsumno *= leaveCriticalFactsDetailsWhenWritingVeryOftenNoDevide;

            totalsumyes *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverYesDevide;
            totalsumno *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesNeverNoDevide;

            totalsumyes *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyYesDevide;
            totalsumno *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesRarelyNoDevide;

            totalsumyes *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesYesDevide;
            totalsumno *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesSometimesNoDevide;

            totalsumyes *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenYesDevide;
            totalsumno *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesOftenNoDevide;

            totalsumyes *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenYesDevide;
            totalsumno *= notebookOrLinedPaperFindDiffiToStayWithInTheLinesVeryOftenNoDevide;

            /**
             * **Result
             */
            System.out.println(totalsumyes);
            System.out.println(totalsumno);

            if(totalsumno > totalsumyes){
                System.out.println("Disease Not Found...You are perfectly fine");
                result="Disease Not Found...You are perfectly fine";
            }
            else if(totalsumno < totalsumyes){
                System.out.println("Disease Found Yes...You have some medical issues");
                result="Disease Found Yes...You have some medical issues";
            }
            else{
                System.out.println("Disease Found Yes/No..Cannot be predict..Sorry");
                result="Disease Found Yes/No..Cannot be predict..Sorry";
            }
        } catch (Exception e) {
            System.out.println(e);

        }

    }
    String result="";

}
