package org.xtext.featuremodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.featuremodel.services.FeatureModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<?xml version=\"1.0\" encoding=\"UTF-8\"?>'", "'<fm:FeatureModel fm:value=\"FeatureModel\"'", "'xmlns:fm=\"http://www.pnp-software.com/XFeature/fmm\"'", "'xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"'", "'xsi:schemaLocation=\"http://www.pnp-software.com/XFeature/fmm ./FeatureModel.xfmm\">'", "'</fm:FeatureModel>'", "'<fm:RootFeature fm:value='", "'>'", "'</fm:RootFeature>'", "'<fm:Annotation fm:value=\"Annotation\">'", "'<fm:Description fm:value='", "'/>'", "'</fm:Annotation>'", "'<fm:Cardinality fm:cardMax='", "'\"1\"'", "'fm:cardMin='", "'1'", "'\"0\"'", "'0'", "'<fm:CardinalityAlternative fm:cardMax=\"1\" fm:cardMin=\"1\"/>'", "'<fm:CardinalityInclusiveOr fm:cardMax=\"n\" fm:cardMin=\"1\"/>'", "'<fm:CardinalityInclusiveOr fm:cardMax=\"*\" fm:cardMin=\"1\"/>'", "'<fm:FeatureGroup fm:value=\"FeatureGroup\">'", "'<fm:GroupedFeatures fm:value='", "','", "'<fm:SolitaryFeature fm:value='", "'</fm:SolitaryFeature>'", "'<fm:SolitaryReference fm:value='", "'</fm:SolitaryReference>'", "'<fm:GroupedFeature fm:value='", "'</fm:GroupedFeature>'", "'</fm:FeatureGroup>'", "'<fm:GroupedReference fm:value='", "'</fm:GroupedReference>'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalFeatureModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFeatureModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFeatureModelParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g"; }



     	private FeatureModelGrammarAccess grammarAccess;
     	
        public InternalFeatureModelParser(TokenStream input, FeatureModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "FeatureModel";	
       	}
       	
       	@Override
       	protected FeatureModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFeatureModel"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:67:1: entryRuleFeatureModel returns [EObject current=null] : iv_ruleFeatureModel= ruleFeatureModel EOF ;
    public final EObject entryRuleFeatureModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureModel = null;


        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:68:2: (iv_ruleFeatureModel= ruleFeatureModel EOF )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:69:2: iv_ruleFeatureModel= ruleFeatureModel EOF
            {
             newCompositeNode(grammarAccess.getFeatureModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureModel_in_entryRuleFeatureModel75);
            iv_ruleFeatureModel=ruleFeatureModel();

            state._fsp--;

             current =iv_ruleFeatureModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureModel"


    // $ANTLR start "ruleFeatureModel"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:76:1: ruleFeatureModel returns [EObject current=null] : (otherlv_0= '<?xml version=\"1.0\" encoding=\"UTF-8\"?>' otherlv_1= '<fm:FeatureModel fm:value=\"FeatureModel\"' otherlv_2= 'xmlns:fm=\"http://www.pnp-software.com/XFeature/fmm\"' otherlv_3= 'xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"' otherlv_4= 'xsi:schemaLocation=\"http://www.pnp-software.com/XFeature/fmm ./FeatureModel.xfmm\">' ( (lv_containsRoot_5_0= ruleRootFeature ) )+ otherlv_6= '</fm:FeatureModel>' ) ;
    public final EObject ruleFeatureModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_containsRoot_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:79:28: ( (otherlv_0= '<?xml version=\"1.0\" encoding=\"UTF-8\"?>' otherlv_1= '<fm:FeatureModel fm:value=\"FeatureModel\"' otherlv_2= 'xmlns:fm=\"http://www.pnp-software.com/XFeature/fmm\"' otherlv_3= 'xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"' otherlv_4= 'xsi:schemaLocation=\"http://www.pnp-software.com/XFeature/fmm ./FeatureModel.xfmm\">' ( (lv_containsRoot_5_0= ruleRootFeature ) )+ otherlv_6= '</fm:FeatureModel>' ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:80:1: (otherlv_0= '<?xml version=\"1.0\" encoding=\"UTF-8\"?>' otherlv_1= '<fm:FeatureModel fm:value=\"FeatureModel\"' otherlv_2= 'xmlns:fm=\"http://www.pnp-software.com/XFeature/fmm\"' otherlv_3= 'xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"' otherlv_4= 'xsi:schemaLocation=\"http://www.pnp-software.com/XFeature/fmm ./FeatureModel.xfmm\">' ( (lv_containsRoot_5_0= ruleRootFeature ) )+ otherlv_6= '</fm:FeatureModel>' )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:80:1: (otherlv_0= '<?xml version=\"1.0\" encoding=\"UTF-8\"?>' otherlv_1= '<fm:FeatureModel fm:value=\"FeatureModel\"' otherlv_2= 'xmlns:fm=\"http://www.pnp-software.com/XFeature/fmm\"' otherlv_3= 'xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"' otherlv_4= 'xsi:schemaLocation=\"http://www.pnp-software.com/XFeature/fmm ./FeatureModel.xfmm\">' ( (lv_containsRoot_5_0= ruleRootFeature ) )+ otherlv_6= '</fm:FeatureModel>' )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:80:3: otherlv_0= '<?xml version=\"1.0\" encoding=\"UTF-8\"?>' otherlv_1= '<fm:FeatureModel fm:value=\"FeatureModel\"' otherlv_2= 'xmlns:fm=\"http://www.pnp-software.com/XFeature/fmm\"' otherlv_3= 'xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"' otherlv_4= 'xsi:schemaLocation=\"http://www.pnp-software.com/XFeature/fmm ./FeatureModel.xfmm\">' ( (lv_containsRoot_5_0= ruleRootFeature ) )+ otherlv_6= '</fm:FeatureModel>'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFeatureModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getFeatureModelAccess().getXmlVersion10EncodingUTF8Keyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFeatureModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureModelAccess().getFmFeatureModelFmValueFeatureModelKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFeatureModel146); 

                	newLeafNode(otherlv_2, grammarAccess.getFeatureModelAccess().getXmlnsFmHttpWwwPnpSoftwareComXFeatureFmmKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFeatureModel158); 

                	newLeafNode(otherlv_3, grammarAccess.getFeatureModelAccess().getXmlnsXsiHttpWwwW3Org2001XMLSchemaInstanceKeyword_3());
                
            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFeatureModel170); 

                	newLeafNode(otherlv_4, grammarAccess.getFeatureModelAccess().getXsiSchemaLocationHttpWwwPnpSoftwareComXFeatureFmmFeatureModelXfmmKeyword_4());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:100:1: ( (lv_containsRoot_5_0= ruleRootFeature ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:101:1: (lv_containsRoot_5_0= ruleRootFeature )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:101:1: (lv_containsRoot_5_0= ruleRootFeature )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:102:3: lv_containsRoot_5_0= ruleRootFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeatureModelAccess().getContainsRootRootFeatureParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRootFeature_in_ruleFeatureModel191);
            	    lv_containsRoot_5_0=ruleRootFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeatureModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containsRoot",
            	            		lv_containsRoot_5_0, 
            	            		"RootFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFeatureModel204); 

                	newLeafNode(otherlv_6, grammarAccess.getFeatureModelAccess().getFmFeatureModelKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureModel"


    // $ANTLR start "entryRuleRootFeature"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:130:1: entryRuleRootFeature returns [EObject current=null] : iv_ruleRootFeature= ruleRootFeature EOF ;
    public final EObject entryRuleRootFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootFeature = null;


        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:131:2: (iv_ruleRootFeature= ruleRootFeature EOF )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:132:2: iv_ruleRootFeature= ruleRootFeature EOF
            {
             newCompositeNode(grammarAccess.getRootFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRootFeature_in_entryRuleRootFeature240);
            iv_ruleRootFeature=ruleRootFeature();

            state._fsp--;

             current =iv_ruleRootFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRootFeature250); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootFeature"


    // $ANTLR start "ruleRootFeature"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:139:1: ruleRootFeature returns [EObject current=null] : (otherlv_0= '<fm:RootFeature fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_annotation_3_0= ruleAnnotation ) )* ( (lv_containsRelation_4_0= ruleRelationship ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:RootFeature>' ) ;
    public final EObject ruleRootFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_annotation_3_0 = null;

        EObject lv_containsRelation_4_0 = null;

        EObject lv_containsFeature_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:142:28: ( (otherlv_0= '<fm:RootFeature fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_annotation_3_0= ruleAnnotation ) )* ( (lv_containsRelation_4_0= ruleRelationship ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:RootFeature>' ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:143:1: (otherlv_0= '<fm:RootFeature fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_annotation_3_0= ruleAnnotation ) )* ( (lv_containsRelation_4_0= ruleRelationship ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:RootFeature>' )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:143:1: (otherlv_0= '<fm:RootFeature fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_annotation_3_0= ruleAnnotation ) )* ( (lv_containsRelation_4_0= ruleRelationship ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:RootFeature>' )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:143:3: otherlv_0= '<fm:RootFeature fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_annotation_3_0= ruleAnnotation ) )* ( (lv_containsRelation_4_0= ruleRelationship ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:RootFeature>'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRootFeature287); 

                	newLeafNode(otherlv_0, grammarAccess.getRootFeatureAccess().getFmRootFeatureFmValueKeyword_0());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:147:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:148:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:148:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:149:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRootFeature304); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRootFeatureAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRootFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRootFeature321); 

                	newLeafNode(otherlv_2, grammarAccess.getRootFeatureAccess().getGreaterThanSignKeyword_2());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:169:1: ( (lv_annotation_3_0= ruleAnnotation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:170:1: (lv_annotation_3_0= ruleAnnotation )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:170:1: (lv_annotation_3_0= ruleAnnotation )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:171:3: lv_annotation_3_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootFeatureAccess().getAnnotationAnnotationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleRootFeature342);
            	    lv_annotation_3_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotation",
            	            		lv_annotation_3_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:187:3: ( (lv_containsRelation_4_0= ruleRelationship ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24||(LA3_0>=30 && LA3_0<=33)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:188:1: (lv_containsRelation_4_0= ruleRelationship )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:188:1: (lv_containsRelation_4_0= ruleRelationship )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:189:3: lv_containsRelation_4_0= ruleRelationship
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootFeatureAccess().getContainsRelationRelationshipParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_ruleRootFeature364);
            	    lv_containsRelation_4_0=ruleRelationship();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containsRelation",
            	            		lv_containsRelation_4_0, 
            	            		"Relationship");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:205:3: ( (lv_containsFeature_5_0= ruleFeature ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==36||LA4_0==38||LA4_0==40||LA4_0==43) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:206:1: (lv_containsFeature_5_0= ruleFeature )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:206:1: (lv_containsFeature_5_0= ruleFeature )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:207:3: lv_containsFeature_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootFeatureAccess().getContainsFeatureFeatureParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleRootFeature386);
            	    lv_containsFeature_5_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containsFeature",
            	            		lv_containsFeature_5_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRootFeature399); 

                	newLeafNode(otherlv_6, grammarAccess.getRootFeatureAccess().getFmRootFeatureKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootFeature"


    // $ANTLR start "entryRuleAnnotation"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:235:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:236:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:237:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation435);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation445); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:244:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '<fm:Annotation fm:value=\"Annotation\">' otherlv_1= '<fm:Description fm:value=' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '/>' otherlv_4= '</fm:Annotation>' ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:247:28: ( (otherlv_0= '<fm:Annotation fm:value=\"Annotation\">' otherlv_1= '<fm:Description fm:value=' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '/>' otherlv_4= '</fm:Annotation>' ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:248:1: (otherlv_0= '<fm:Annotation fm:value=\"Annotation\">' otherlv_1= '<fm:Description fm:value=' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '/>' otherlv_4= '</fm:Annotation>' )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:248:1: (otherlv_0= '<fm:Annotation fm:value=\"Annotation\">' otherlv_1= '<fm:Description fm:value=' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '/>' otherlv_4= '</fm:Annotation>' )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:248:3: otherlv_0= '<fm:Annotation fm:value=\"Annotation\">' otherlv_1= '<fm:Description fm:value=' ( (lv_description_2_0= RULE_STRING ) ) otherlv_3= '/>' otherlv_4= '</fm:Annotation>'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAnnotation482); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getFmAnnotationFmValueAnnotationKeyword_0());
                
            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAnnotation494); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getFmDescriptionFmValueKeyword_1());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:256:1: ( (lv_description_2_0= RULE_STRING ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:257:1: (lv_description_2_0= RULE_STRING )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:257:1: (lv_description_2_0= RULE_STRING )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:258:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnnotation511); 

            			newLeafNode(lv_description_2_0, grammarAccess.getAnnotationAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAnnotation528); 

                	newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getSolidusGreaterThanSignKeyword_3());
                
            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAnnotation540); 

                	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getFmAnnotationKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleRelationship"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:290:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:291:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:292:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_entryRuleRelationship576);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationship586); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:299:1: ruleRelationship returns [EObject current=null] : (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternative_2= ruleAlternative | this_Inclusive_Or_3= ruleInclusive_Or | this_GroupCardinality_4= ruleGroupCardinality ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Mandatory_0 = null;

        EObject this_Optional_1 = null;

        EObject this_Alternative_2 = null;

        EObject this_Inclusive_Or_3 = null;

        EObject this_GroupCardinality_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:302:28: ( (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternative_2= ruleAlternative | this_Inclusive_Or_3= ruleInclusive_Or | this_GroupCardinality_4= ruleGroupCardinality ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:303:1: (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternative_2= ruleAlternative | this_Inclusive_Or_3= ruleInclusive_Or | this_GroupCardinality_4= ruleGroupCardinality )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:303:1: (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternative_2= ruleAlternative | this_Inclusive_Or_3= ruleInclusive_Or | this_GroupCardinality_4= ruleGroupCardinality )
            int alt5=5;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:304:5: this_Mandatory_0= ruleMandatory
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getMandatoryParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMandatory_in_ruleRelationship633);
                    this_Mandatory_0=ruleMandatory();

                    state._fsp--;

                     
                            current = this_Mandatory_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:314:5: this_Optional_1= ruleOptional
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getOptionalParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOptional_in_ruleRelationship660);
                    this_Optional_1=ruleOptional();

                    state._fsp--;

                     
                            current = this_Optional_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:324:5: this_Alternative_2= ruleAlternative
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getAlternativeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAlternative_in_ruleRelationship687);
                    this_Alternative_2=ruleAlternative();

                    state._fsp--;

                     
                            current = this_Alternative_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:334:5: this_Inclusive_Or_3= ruleInclusive_Or
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getInclusive_OrParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInclusive_Or_in_ruleRelationship714);
                    this_Inclusive_Or_3=ruleInclusive_Or();

                    state._fsp--;

                     
                            current = this_Inclusive_Or_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:344:5: this_GroupCardinality_4= ruleGroupCardinality
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getGroupCardinalityParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGroupCardinality_in_ruleRelationship741);
                    this_GroupCardinality_4=ruleGroupCardinality();

                    state._fsp--;

                     
                            current = this_GroupCardinality_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleMandatory"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:360:1: entryRuleMandatory returns [EObject current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final EObject entryRuleMandatory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatory = null;


        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:361:2: (iv_ruleMandatory= ruleMandatory EOF )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:362:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMandatory_in_entryRuleMandatory776);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMandatory786); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:369:1: ruleMandatory returns [EObject current=null] : ( ( () otherlv_1= '<fm:Cardinality fm:cardMax=' otherlv_2= '\"1\"' otherlv_3= 'fm:cardMin=' otherlv_4= '\"1\"' otherlv_5= '/>' ) | (otherlv_6= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_7_0= RULE_STRING ) ) otherlv_8= 'fm:cardMin=' ( (lv_cardinalityMin_9_0= '1' ) ) otherlv_10= '/>' ) ) ;
    public final EObject ruleMandatory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_cardinalityMax_7_0=null;
        Token otherlv_8=null;
        Token lv_cardinalityMin_9_0=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:372:28: ( ( ( () otherlv_1= '<fm:Cardinality fm:cardMax=' otherlv_2= '\"1\"' otherlv_3= 'fm:cardMin=' otherlv_4= '\"1\"' otherlv_5= '/>' ) | (otherlv_6= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_7_0= RULE_STRING ) ) otherlv_8= 'fm:cardMin=' ( (lv_cardinalityMin_9_0= '1' ) ) otherlv_10= '/>' ) ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:373:1: ( ( () otherlv_1= '<fm:Cardinality fm:cardMax=' otherlv_2= '\"1\"' otherlv_3= 'fm:cardMin=' otherlv_4= '\"1\"' otherlv_5= '/>' ) | (otherlv_6= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_7_0= RULE_STRING ) ) otherlv_8= 'fm:cardMin=' ( (lv_cardinalityMin_9_0= '1' ) ) otherlv_10= '/>' ) )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:373:1: ( ( () otherlv_1= '<fm:Cardinality fm:cardMax=' otherlv_2= '\"1\"' otherlv_3= 'fm:cardMin=' otherlv_4= '\"1\"' otherlv_5= '/>' ) | (otherlv_6= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_7_0= RULE_STRING ) ) otherlv_8= 'fm:cardMin=' ( (lv_cardinalityMin_9_0= '1' ) ) otherlv_10= '/>' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==25) ) {
                    alt6=1;
                }
                else if ( (LA6_1==RULE_STRING) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:373:2: ( () otherlv_1= '<fm:Cardinality fm:cardMax=' otherlv_2= '\"1\"' otherlv_3= 'fm:cardMin=' otherlv_4= '\"1\"' otherlv_5= '/>' )
                    {
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:373:2: ( () otherlv_1= '<fm:Cardinality fm:cardMax=' otherlv_2= '\"1\"' otherlv_3= 'fm:cardMin=' otherlv_4= '\"1\"' otherlv_5= '/>' )
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:373:3: () otherlv_1= '<fm:Cardinality fm:cardMax=' otherlv_2= '\"1\"' otherlv_3= 'fm:cardMin=' otherlv_4= '\"1\"' otherlv_5= '/>'
                    {
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:373:3: ()
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:374:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMandatoryAccess().getMandatoryAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMandatory833); 

                        	newLeafNode(otherlv_1, grammarAccess.getMandatoryAccess().getFmCardinalityFmCardMaxKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMandatory845); 

                        	newLeafNode(otherlv_2, grammarAccess.getMandatoryAccess().getQuotationMarkDigitOneQuotationMarkKeyword_0_2());
                        
                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMandatory857); 

                        	newLeafNode(otherlv_3, grammarAccess.getMandatoryAccess().getFmCardMinKeyword_0_3());
                        
                    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMandatory869); 

                        	newLeafNode(otherlv_4, grammarAccess.getMandatoryAccess().getQuotationMarkDigitOneQuotationMarkKeyword_0_4());
                        
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMandatory881); 

                        	newLeafNode(otherlv_5, grammarAccess.getMandatoryAccess().getSolidusGreaterThanSignKeyword_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:400:6: (otherlv_6= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_7_0= RULE_STRING ) ) otherlv_8= 'fm:cardMin=' ( (lv_cardinalityMin_9_0= '1' ) ) otherlv_10= '/>' )
                    {
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:400:6: (otherlv_6= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_7_0= RULE_STRING ) ) otherlv_8= 'fm:cardMin=' ( (lv_cardinalityMin_9_0= '1' ) ) otherlv_10= '/>' )
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:400:8: otherlv_6= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_7_0= RULE_STRING ) ) otherlv_8= 'fm:cardMin=' ( (lv_cardinalityMin_9_0= '1' ) ) otherlv_10= '/>'
                    {
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMandatory901); 

                        	newLeafNode(otherlv_6, grammarAccess.getMandatoryAccess().getFmCardinalityFmCardMaxKeyword_1_0());
                        
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:404:1: ( (lv_cardinalityMax_7_0= RULE_STRING ) )
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:405:1: (lv_cardinalityMax_7_0= RULE_STRING )
                    {
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:405:1: (lv_cardinalityMax_7_0= RULE_STRING )
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:406:3: lv_cardinalityMax_7_0= RULE_STRING
                    {
                    lv_cardinalityMax_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMandatory918); 

                    			newLeafNode(lv_cardinalityMax_7_0, grammarAccess.getMandatoryAccess().getCardinalityMaxSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMandatoryRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cardinalityMax",
                            		lv_cardinalityMax_7_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMandatory935); 

                        	newLeafNode(otherlv_8, grammarAccess.getMandatoryAccess().getFmCardMinKeyword_1_2());
                        
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:426:1: ( (lv_cardinalityMin_9_0= '1' ) )
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:427:1: (lv_cardinalityMin_9_0= '1' )
                    {
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:427:1: (lv_cardinalityMin_9_0= '1' )
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:428:3: lv_cardinalityMin_9_0= '1'
                    {
                    lv_cardinalityMin_9_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMandatory953); 

                            newLeafNode(lv_cardinalityMin_9_0, grammarAccess.getMandatoryAccess().getCardinalityMin1Keyword_1_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMandatoryRule());
                    	        }
                           		setWithLastConsumed(current, "cardinalityMin", lv_cardinalityMin_9_0, "1");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMandatory978); 

                        	newLeafNode(otherlv_10, grammarAccess.getMandatoryAccess().getSolidusGreaterThanSignKeyword_1_4());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleOptional"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:453:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:454:2: (iv_ruleOptional= ruleOptional EOF )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:455:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptional_in_entryRuleOptional1015);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptional1025); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:462:1: ruleOptional returns [EObject current=null] : ( ( () otherlv_1= '<fm:Cardinality fm:cardMax=' otherlv_2= '\"1\"' otherlv_3= 'fm:cardMin=' otherlv_4= '\"0\"' otherlv_5= '/>' ) | (otherlv_6= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_7_0= RULE_STRING ) ) otherlv_8= 'fm:cardMin=' ( (lv_cardinalityMin_9_0= '0' ) ) otherlv_10= '/>' ) ) ;
    public final EObject ruleOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_cardinalityMax_7_0=null;
        Token otherlv_8=null;
        Token lv_cardinalityMin_9_0=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:465:28: ( ( ( () otherlv_1= '<fm:Cardinality fm:cardMax=' otherlv_2= '\"1\"' otherlv_3= 'fm:cardMin=' otherlv_4= '\"0\"' otherlv_5= '/>' ) | (otherlv_6= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_7_0= RULE_STRING ) ) otherlv_8= 'fm:cardMin=' ( (lv_cardinalityMin_9_0= '0' ) ) otherlv_10= '/>' ) ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:466:1: ( ( () otherlv_1= '<fm:Cardinality fm:cardMax=' otherlv_2= '\"1\"' otherlv_3= 'fm:cardMin=' otherlv_4= '\"0\"' otherlv_5= '/>' ) | (otherlv_6= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_7_0= RULE_STRING ) ) otherlv_8= 'fm:cardMin=' ( (lv_cardinalityMin_9_0= '0' ) ) otherlv_10= '/>' ) )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:466:1: ( ( () otherlv_1= '<fm:Cardinality fm:cardMax=' otherlv_2= '\"1\"' otherlv_3= 'fm:cardMin=' otherlv_4= '\"0\"' otherlv_5= '/>' ) | (otherlv_6= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_7_0= RULE_STRING ) ) otherlv_8= 'fm:cardMin=' ( (lv_cardinalityMin_9_0= '0' ) ) otherlv_10= '/>' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_STRING) ) {
                    alt7=2;
                }
                else if ( (LA7_1==25) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:466:2: ( () otherlv_1= '<fm:Cardinality fm:cardMax=' otherlv_2= '\"1\"' otherlv_3= 'fm:cardMin=' otherlv_4= '\"0\"' otherlv_5= '/>' )
                    {
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:466:2: ( () otherlv_1= '<fm:Cardinality fm:cardMax=' otherlv_2= '\"1\"' otherlv_3= 'fm:cardMin=' otherlv_4= '\"0\"' otherlv_5= '/>' )
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:466:3: () otherlv_1= '<fm:Cardinality fm:cardMax=' otherlv_2= '\"1\"' otherlv_3= 'fm:cardMin=' otherlv_4= '\"0\"' otherlv_5= '/>'
                    {
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:466:3: ()
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:467:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOptionalAccess().getOptionalAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleOptional1072); 

                        	newLeafNode(otherlv_1, grammarAccess.getOptionalAccess().getFmCardinalityFmCardMaxKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleOptional1084); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionalAccess().getQuotationMarkDigitOneQuotationMarkKeyword_0_2());
                        
                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleOptional1096); 

                        	newLeafNode(otherlv_3, grammarAccess.getOptionalAccess().getFmCardMinKeyword_0_3());
                        
                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleOptional1108); 

                        	newLeafNode(otherlv_4, grammarAccess.getOptionalAccess().getQuotationMarkDigitZeroQuotationMarkKeyword_0_4());
                        
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleOptional1120); 

                        	newLeafNode(otherlv_5, grammarAccess.getOptionalAccess().getSolidusGreaterThanSignKeyword_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:493:6: (otherlv_6= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_7_0= RULE_STRING ) ) otherlv_8= 'fm:cardMin=' ( (lv_cardinalityMin_9_0= '0' ) ) otherlv_10= '/>' )
                    {
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:493:6: (otherlv_6= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_7_0= RULE_STRING ) ) otherlv_8= 'fm:cardMin=' ( (lv_cardinalityMin_9_0= '0' ) ) otherlv_10= '/>' )
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:493:8: otherlv_6= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_7_0= RULE_STRING ) ) otherlv_8= 'fm:cardMin=' ( (lv_cardinalityMin_9_0= '0' ) ) otherlv_10= '/>'
                    {
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleOptional1140); 

                        	newLeafNode(otherlv_6, grammarAccess.getOptionalAccess().getFmCardinalityFmCardMaxKeyword_1_0());
                        
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:497:1: ( (lv_cardinalityMax_7_0= RULE_STRING ) )
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:498:1: (lv_cardinalityMax_7_0= RULE_STRING )
                    {
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:498:1: (lv_cardinalityMax_7_0= RULE_STRING )
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:499:3: lv_cardinalityMax_7_0= RULE_STRING
                    {
                    lv_cardinalityMax_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleOptional1157); 

                    			newLeafNode(lv_cardinalityMax_7_0, grammarAccess.getOptionalAccess().getCardinalityMaxSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOptionalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cardinalityMax",
                            		lv_cardinalityMax_7_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleOptional1174); 

                        	newLeafNode(otherlv_8, grammarAccess.getOptionalAccess().getFmCardMinKeyword_1_2());
                        
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:519:1: ( (lv_cardinalityMin_9_0= '0' ) )
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:520:1: (lv_cardinalityMin_9_0= '0' )
                    {
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:520:1: (lv_cardinalityMin_9_0= '0' )
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:521:3: lv_cardinalityMin_9_0= '0'
                    {
                    lv_cardinalityMin_9_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleOptional1192); 

                            newLeafNode(lv_cardinalityMin_9_0, grammarAccess.getOptionalAccess().getCardinalityMin0Keyword_1_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOptionalRule());
                    	        }
                           		setWithLastConsumed(current, "cardinalityMin", lv_cardinalityMin_9_0, "0");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleOptional1217); 

                        	newLeafNode(otherlv_10, grammarAccess.getOptionalAccess().getSolidusGreaterThanSignKeyword_1_4());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleAlternative"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:546:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:547:2: (iv_ruleAlternative= ruleAlternative EOF )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:548:2: iv_ruleAlternative= ruleAlternative EOF
            {
             newCompositeNode(grammarAccess.getAlternativeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAlternative_in_entryRuleAlternative1254);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;

             current =iv_ruleAlternative; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAlternative1264); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:555:1: ruleAlternative returns [EObject current=null] : ( () otherlv_1= '<fm:CardinalityAlternative fm:cardMax=\"1\" fm:cardMin=\"1\"/>' ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:558:28: ( ( () otherlv_1= '<fm:CardinalityAlternative fm:cardMax=\"1\" fm:cardMin=\"1\"/>' ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:559:1: ( () otherlv_1= '<fm:CardinalityAlternative fm:cardMax=\"1\" fm:cardMin=\"1\"/>' )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:559:1: ( () otherlv_1= '<fm:CardinalityAlternative fm:cardMax=\"1\" fm:cardMin=\"1\"/>' )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:559:2: () otherlv_1= '<fm:CardinalityAlternative fm:cardMax=\"1\" fm:cardMin=\"1\"/>'
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:559:2: ()
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:560:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAlternativeAccess().getAlternativeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAlternative1310); 

                	newLeafNode(otherlv_1, grammarAccess.getAlternativeAccess().getFmCardinalityAlternativeFmCardMax1FmCardMin1Keyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleInclusive_Or"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:577:1: entryRuleInclusive_Or returns [EObject current=null] : iv_ruleInclusive_Or= ruleInclusive_Or EOF ;
    public final EObject entryRuleInclusive_Or() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclusive_Or = null;


        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:578:2: (iv_ruleInclusive_Or= ruleInclusive_Or EOF )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:579:2: iv_ruleInclusive_Or= ruleInclusive_Or EOF
            {
             newCompositeNode(grammarAccess.getInclusive_OrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInclusive_Or_in_entryRuleInclusive_Or1346);
            iv_ruleInclusive_Or=ruleInclusive_Or();

            state._fsp--;

             current =iv_ruleInclusive_Or; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInclusive_Or1356); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInclusive_Or"


    // $ANTLR start "ruleInclusive_Or"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:586:1: ruleInclusive_Or returns [EObject current=null] : ( () (otherlv_1= '<fm:CardinalityInclusiveOr fm:cardMax=\"n\" fm:cardMin=\"1\"/>' | otherlv_2= '<fm:CardinalityInclusiveOr fm:cardMax=\"*\" fm:cardMin=\"1\"/>' ) ) ;
    public final EObject ruleInclusive_Or() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:589:28: ( ( () (otherlv_1= '<fm:CardinalityInclusiveOr fm:cardMax=\"n\" fm:cardMin=\"1\"/>' | otherlv_2= '<fm:CardinalityInclusiveOr fm:cardMax=\"*\" fm:cardMin=\"1\"/>' ) ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:590:1: ( () (otherlv_1= '<fm:CardinalityInclusiveOr fm:cardMax=\"n\" fm:cardMin=\"1\"/>' | otherlv_2= '<fm:CardinalityInclusiveOr fm:cardMax=\"*\" fm:cardMin=\"1\"/>' ) )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:590:1: ( () (otherlv_1= '<fm:CardinalityInclusiveOr fm:cardMax=\"n\" fm:cardMin=\"1\"/>' | otherlv_2= '<fm:CardinalityInclusiveOr fm:cardMax=\"*\" fm:cardMin=\"1\"/>' ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:590:2: () (otherlv_1= '<fm:CardinalityInclusiveOr fm:cardMax=\"n\" fm:cardMin=\"1\"/>' | otherlv_2= '<fm:CardinalityInclusiveOr fm:cardMax=\"*\" fm:cardMin=\"1\"/>' )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:590:2: ()
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:591:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInclusive_OrAccess().getInclusive_OrAction_0(),
                        current);
                

            }

            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:596:2: (otherlv_1= '<fm:CardinalityInclusiveOr fm:cardMax=\"n\" fm:cardMin=\"1\"/>' | otherlv_2= '<fm:CardinalityInclusiveOr fm:cardMax=\"*\" fm:cardMin=\"1\"/>' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            else if ( (LA8_0==32) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:596:4: otherlv_1= '<fm:CardinalityInclusiveOr fm:cardMax=\"n\" fm:cardMin=\"1\"/>'
                    {
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInclusive_Or1403); 

                        	newLeafNode(otherlv_1, grammarAccess.getInclusive_OrAccess().getFmCardinalityInclusiveOrFmCardMaxNFmCardMin1Keyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:601:7: otherlv_2= '<fm:CardinalityInclusiveOr fm:cardMax=\"*\" fm:cardMin=\"1\"/>'
                    {
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInclusive_Or1421); 

                        	newLeafNode(otherlv_2, grammarAccess.getInclusive_OrAccess().getFmCardinalityInclusiveOrFmCardMaxFmCardMin1Keyword_1_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInclusive_Or"


    // $ANTLR start "entryRuleGroupCardinality"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:613:1: entryRuleGroupCardinality returns [EObject current=null] : iv_ruleGroupCardinality= ruleGroupCardinality EOF ;
    public final EObject entryRuleGroupCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupCardinality = null;


        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:614:2: (iv_ruleGroupCardinality= ruleGroupCardinality EOF )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:615:2: iv_ruleGroupCardinality= ruleGroupCardinality EOF
            {
             newCompositeNode(grammarAccess.getGroupCardinalityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupCardinality_in_entryRuleGroupCardinality1458);
            iv_ruleGroupCardinality=ruleGroupCardinality();

            state._fsp--;

             current =iv_ruleGroupCardinality; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroupCardinality1468); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupCardinality"


    // $ANTLR start "ruleGroupCardinality"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:622:1: ruleGroupCardinality returns [EObject current=null] : (otherlv_0= '<fm:FeatureGroup fm:value=\"FeatureGroup\">' otherlv_1= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_2_0= RULE_STRING ) ) otherlv_3= 'fm:cardMin=' ( (lv_cardinalityMin_4_0= RULE_STRING ) ) otherlv_5= '/>' otherlv_6= '<fm:GroupedFeatures fm:value=' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* otherlv_10= '/>' ) ;
    public final EObject ruleGroupCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cardinalityMax_2_0=null;
        Token otherlv_3=null;
        Token lv_cardinalityMin_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:625:28: ( (otherlv_0= '<fm:FeatureGroup fm:value=\"FeatureGroup\">' otherlv_1= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_2_0= RULE_STRING ) ) otherlv_3= 'fm:cardMin=' ( (lv_cardinalityMin_4_0= RULE_STRING ) ) otherlv_5= '/>' otherlv_6= '<fm:GroupedFeatures fm:value=' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* otherlv_10= '/>' ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:626:1: (otherlv_0= '<fm:FeatureGroup fm:value=\"FeatureGroup\">' otherlv_1= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_2_0= RULE_STRING ) ) otherlv_3= 'fm:cardMin=' ( (lv_cardinalityMin_4_0= RULE_STRING ) ) otherlv_5= '/>' otherlv_6= '<fm:GroupedFeatures fm:value=' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* otherlv_10= '/>' )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:626:1: (otherlv_0= '<fm:FeatureGroup fm:value=\"FeatureGroup\">' otherlv_1= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_2_0= RULE_STRING ) ) otherlv_3= 'fm:cardMin=' ( (lv_cardinalityMin_4_0= RULE_STRING ) ) otherlv_5= '/>' otherlv_6= '<fm:GroupedFeatures fm:value=' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* otherlv_10= '/>' )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:626:3: otherlv_0= '<fm:FeatureGroup fm:value=\"FeatureGroup\">' otherlv_1= '<fm:Cardinality fm:cardMax=' ( (lv_cardinalityMax_2_0= RULE_STRING ) ) otherlv_3= 'fm:cardMin=' ( (lv_cardinalityMin_4_0= RULE_STRING ) ) otherlv_5= '/>' otherlv_6= '<fm:GroupedFeatures fm:value=' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* otherlv_10= '/>'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleGroupCardinality1505); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupCardinalityAccess().getFmFeatureGroupFmValueFeatureGroupKeyword_0());
                
            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGroupCardinality1517); 

                	newLeafNode(otherlv_1, grammarAccess.getGroupCardinalityAccess().getFmCardinalityFmCardMaxKeyword_1());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:634:1: ( (lv_cardinalityMax_2_0= RULE_STRING ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:635:1: (lv_cardinalityMax_2_0= RULE_STRING )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:635:1: (lv_cardinalityMax_2_0= RULE_STRING )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:636:3: lv_cardinalityMax_2_0= RULE_STRING
            {
            lv_cardinalityMax_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleGroupCardinality1534); 

            			newLeafNode(lv_cardinalityMax_2_0, grammarAccess.getGroupCardinalityAccess().getCardinalityMaxSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupCardinalityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"cardinalityMax",
                    		lv_cardinalityMax_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleGroupCardinality1551); 

                	newLeafNode(otherlv_3, grammarAccess.getGroupCardinalityAccess().getFmCardMinKeyword_3());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:656:1: ( (lv_cardinalityMin_4_0= RULE_STRING ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:657:1: (lv_cardinalityMin_4_0= RULE_STRING )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:657:1: (lv_cardinalityMin_4_0= RULE_STRING )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:658:3: lv_cardinalityMin_4_0= RULE_STRING
            {
            lv_cardinalityMin_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleGroupCardinality1568); 

            			newLeafNode(lv_cardinalityMin_4_0, grammarAccess.getGroupCardinalityAccess().getCardinalityMinSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupCardinalityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"cardinalityMin",
                    		lv_cardinalityMin_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleGroupCardinality1585); 

                	newLeafNode(otherlv_5, grammarAccess.getGroupCardinalityAccess().getSolidusGreaterThanSignKeyword_5());
                
            otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleGroupCardinality1597); 

                	newLeafNode(otherlv_6, grammarAccess.getGroupCardinalityAccess().getFmGroupedFeaturesFmValueKeyword_6());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:682:1: ( (otherlv_7= RULE_STRING ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:683:1: (otherlv_7= RULE_STRING )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:683:1: (otherlv_7= RULE_STRING )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:684:3: otherlv_7= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupCardinalityRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleGroupCardinality1617); 

            		newLeafNode(otherlv_7, grammarAccess.getGroupCardinalityAccess().getTargetGroupedFeatureCrossReference_7_0()); 
            	

            }


            }

            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:695:2: (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:695:4: otherlv_8= ',' ( (otherlv_9= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleGroupCardinality1630); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGroupCardinalityAccess().getCommaKeyword_8_0());
            	        
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:699:1: ( (otherlv_9= RULE_STRING ) )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:700:1: (otherlv_9= RULE_STRING )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:700:1: (otherlv_9= RULE_STRING )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:701:3: otherlv_9= RULE_STRING
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupCardinalityRule());
            	    	        }
            	            
            	    otherlv_9=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleGroupCardinality1650); 

            	    		newLeafNode(otherlv_9, grammarAccess.getGroupCardinalityAccess().getTargetGroupedFeatureCrossReference_8_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleGroupCardinality1664); 

                	newLeafNode(otherlv_10, grammarAccess.getGroupCardinalityAccess().getSolidusGreaterThanSignKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupCardinality"


    // $ANTLR start "entryRuleFeature"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:724:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:725:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:726:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature1700);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature1710); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:733:1: ruleFeature returns [EObject current=null] : (this_Feature_Impl_0= ruleFeature_Impl | this_ReferenceFeature_1= ruleReferenceFeature | this_GroupedFeature_2= ruleGroupedFeature | this_GroupedReference_3= ruleGroupedReference ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Feature_Impl_0 = null;

        EObject this_ReferenceFeature_1 = null;

        EObject this_GroupedFeature_2 = null;

        EObject this_GroupedReference_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:736:28: ( (this_Feature_Impl_0= ruleFeature_Impl | this_ReferenceFeature_1= ruleReferenceFeature | this_GroupedFeature_2= ruleGroupedFeature | this_GroupedReference_3= ruleGroupedReference ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:737:1: (this_Feature_Impl_0= ruleFeature_Impl | this_ReferenceFeature_1= ruleReferenceFeature | this_GroupedFeature_2= ruleGroupedFeature | this_GroupedReference_3= ruleGroupedReference )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:737:1: (this_Feature_Impl_0= ruleFeature_Impl | this_ReferenceFeature_1= ruleReferenceFeature | this_GroupedFeature_2= ruleGroupedFeature | this_GroupedReference_3= ruleGroupedReference )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case 38:
                {
                alt10=2;
                }
                break;
            case 40:
                {
                alt10=3;
                }
                break;
            case 43:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:738:5: this_Feature_Impl_0= ruleFeature_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getFeature_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFeature_Impl_in_ruleFeature1757);
                    this_Feature_Impl_0=ruleFeature_Impl();

                    state._fsp--;

                     
                            current = this_Feature_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:748:5: this_ReferenceFeature_1= ruleReferenceFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getReferenceFeatureParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReferenceFeature_in_ruleFeature1784);
                    this_ReferenceFeature_1=ruleReferenceFeature();

                    state._fsp--;

                     
                            current = this_ReferenceFeature_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:758:5: this_GroupedFeature_2= ruleGroupedFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getGroupedFeatureParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_ruleFeature1811);
                    this_GroupedFeature_2=ruleGroupedFeature();

                    state._fsp--;

                     
                            current = this_GroupedFeature_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:768:5: this_GroupedReference_3= ruleGroupedReference
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getGroupedReferenceParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGroupedReference_in_ruleFeature1838);
                    this_GroupedReference_3=ruleGroupedReference();

                    state._fsp--;

                     
                            current = this_GroupedReference_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFeature_Impl"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:784:1: entryRuleFeature_Impl returns [EObject current=null] : iv_ruleFeature_Impl= ruleFeature_Impl EOF ;
    public final EObject entryRuleFeature_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature_Impl = null;


        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:785:2: (iv_ruleFeature_Impl= ruleFeature_Impl EOF )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:786:2: iv_ruleFeature_Impl= ruleFeature_Impl EOF
            {
             newCompositeNode(grammarAccess.getFeature_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl1873);
            iv_ruleFeature_Impl=ruleFeature_Impl();

            state._fsp--;

             current =iv_ruleFeature_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature_Impl1883); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature_Impl"


    // $ANTLR start "ruleFeature_Impl"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:793:1: ruleFeature_Impl returns [EObject current=null] : (otherlv_0= '<fm:SolitaryFeature fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_annotation_3_0= ruleAnnotation ) )* ( (lv_containsRelation_4_0= ruleRelationship ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:SolitaryFeature>' ) ;
    public final EObject ruleFeature_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_annotation_3_0 = null;

        EObject lv_containsRelation_4_0 = null;

        EObject lv_containsFeature_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:796:28: ( (otherlv_0= '<fm:SolitaryFeature fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_annotation_3_0= ruleAnnotation ) )* ( (lv_containsRelation_4_0= ruleRelationship ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:SolitaryFeature>' ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:797:1: (otherlv_0= '<fm:SolitaryFeature fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_annotation_3_0= ruleAnnotation ) )* ( (lv_containsRelation_4_0= ruleRelationship ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:SolitaryFeature>' )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:797:1: (otherlv_0= '<fm:SolitaryFeature fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_annotation_3_0= ruleAnnotation ) )* ( (lv_containsRelation_4_0= ruleRelationship ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:SolitaryFeature>' )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:797:3: otherlv_0= '<fm:SolitaryFeature fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_annotation_3_0= ruleAnnotation ) )* ( (lv_containsRelation_4_0= ruleRelationship ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:SolitaryFeature>'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleFeature_Impl1920); 

                	newLeafNode(otherlv_0, grammarAccess.getFeature_ImplAccess().getFmSolitaryFeatureFmValueKeyword_0());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:801:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:802:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:802:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:803:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleFeature_Impl1937); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFeature_ImplAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeature_ImplRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFeature_Impl1954); 

                	newLeafNode(otherlv_2, grammarAccess.getFeature_ImplAccess().getGreaterThanSignKeyword_2());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:823:1: ( (lv_annotation_3_0= ruleAnnotation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:824:1: (lv_annotation_3_0= ruleAnnotation )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:824:1: (lv_annotation_3_0= ruleAnnotation )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:825:3: lv_annotation_3_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getAnnotationAnnotationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleFeature_Impl1975);
            	    lv_annotation_3_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotation",
            	            		lv_annotation_3_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:841:3: ( (lv_containsRelation_4_0= ruleRelationship ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24||(LA12_0>=30 && LA12_0<=33)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:842:1: (lv_containsRelation_4_0= ruleRelationship )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:842:1: (lv_containsRelation_4_0= ruleRelationship )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:843:3: lv_containsRelation_4_0= ruleRelationship
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getContainsRelationRelationshipParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_ruleFeature_Impl1997);
            	    lv_containsRelation_4_0=ruleRelationship();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containsRelation",
            	            		lv_containsRelation_4_0, 
            	            		"Relationship");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:859:3: ( (lv_containsFeature_5_0= ruleFeature ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==36||LA13_0==38||LA13_0==40||LA13_0==43) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:860:1: (lv_containsFeature_5_0= ruleFeature )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:860:1: (lv_containsFeature_5_0= ruleFeature )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:861:3: lv_containsFeature_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeature_ImplAccess().getContainsFeatureFeatureParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleFeature_Impl2019);
            	    lv_containsFeature_5_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containsFeature",
            	            		lv_containsFeature_5_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleFeature_Impl2032); 

                	newLeafNode(otherlv_6, grammarAccess.getFeature_ImplAccess().getFmSolitaryFeatureKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature_Impl"


    // $ANTLR start "entryRuleReferenceFeature"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:889:1: entryRuleReferenceFeature returns [EObject current=null] : iv_ruleReferenceFeature= ruleReferenceFeature EOF ;
    public final EObject entryRuleReferenceFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceFeature = null;


        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:890:2: (iv_ruleReferenceFeature= ruleReferenceFeature EOF )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:891:2: iv_ruleReferenceFeature= ruleReferenceFeature EOF
            {
             newCompositeNode(grammarAccess.getReferenceFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferenceFeature_in_entryRuleReferenceFeature2068);
            iv_ruleReferenceFeature=ruleReferenceFeature();

            state._fsp--;

             current =iv_ruleReferenceFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferenceFeature2078); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceFeature"


    // $ANTLR start "ruleReferenceFeature"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:898:1: ruleReferenceFeature returns [EObject current=null] : (otherlv_0= '<fm:SolitaryReference fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_annotation_3_0= ruleAnnotation ) )* ( (lv_containsRelation_4_0= ruleRelationship ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:SolitaryReference>' ) ;
    public final EObject ruleReferenceFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_annotation_3_0 = null;

        EObject lv_containsRelation_4_0 = null;

        EObject lv_containsFeature_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:901:28: ( (otherlv_0= '<fm:SolitaryReference fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_annotation_3_0= ruleAnnotation ) )* ( (lv_containsRelation_4_0= ruleRelationship ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:SolitaryReference>' ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:902:1: (otherlv_0= '<fm:SolitaryReference fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_annotation_3_0= ruleAnnotation ) )* ( (lv_containsRelation_4_0= ruleRelationship ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:SolitaryReference>' )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:902:1: (otherlv_0= '<fm:SolitaryReference fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_annotation_3_0= ruleAnnotation ) )* ( (lv_containsRelation_4_0= ruleRelationship ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:SolitaryReference>' )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:902:3: otherlv_0= '<fm:SolitaryReference fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_annotation_3_0= ruleAnnotation ) )* ( (lv_containsRelation_4_0= ruleRelationship ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:SolitaryReference>'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleReferenceFeature2115); 

                	newLeafNode(otherlv_0, grammarAccess.getReferenceFeatureAccess().getFmSolitaryReferenceFmValueKeyword_0());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:906:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:907:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:907:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:908:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleReferenceFeature2132); 

            			newLeafNode(lv_name_1_0, grammarAccess.getReferenceFeatureAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleReferenceFeature2149); 

                	newLeafNode(otherlv_2, grammarAccess.getReferenceFeatureAccess().getGreaterThanSignKeyword_2());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:928:1: ( (lv_annotation_3_0= ruleAnnotation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:929:1: (lv_annotation_3_0= ruleAnnotation )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:929:1: (lv_annotation_3_0= ruleAnnotation )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:930:3: lv_annotation_3_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReferenceFeatureAccess().getAnnotationAnnotationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleReferenceFeature2170);
            	    lv_annotation_3_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReferenceFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotation",
            	            		lv_annotation_3_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:946:3: ( (lv_containsRelation_4_0= ruleRelationship ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24||(LA15_0>=30 && LA15_0<=33)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:947:1: (lv_containsRelation_4_0= ruleRelationship )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:947:1: (lv_containsRelation_4_0= ruleRelationship )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:948:3: lv_containsRelation_4_0= ruleRelationship
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReferenceFeatureAccess().getContainsRelationRelationshipParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_ruleReferenceFeature2192);
            	    lv_containsRelation_4_0=ruleRelationship();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReferenceFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containsRelation",
            	            		lv_containsRelation_4_0, 
            	            		"Relationship");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:964:3: ( (lv_containsFeature_5_0= ruleFeature ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36||LA16_0==38||LA16_0==40||LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:965:1: (lv_containsFeature_5_0= ruleFeature )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:965:1: (lv_containsFeature_5_0= ruleFeature )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:966:3: lv_containsFeature_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReferenceFeatureAccess().getContainsFeatureFeatureParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleReferenceFeature2214);
            	    lv_containsFeature_5_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReferenceFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containsFeature",
            	            		lv_containsFeature_5_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleReferenceFeature2227); 

                	newLeafNode(otherlv_6, grammarAccess.getReferenceFeatureAccess().getFmSolitaryReferenceKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceFeature"


    // $ANTLR start "entryRuleGroupedFeature"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:994:1: entryRuleGroupedFeature returns [EObject current=null] : iv_ruleGroupedFeature= ruleGroupedFeature EOF ;
    public final EObject entryRuleGroupedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupedFeature = null;


        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:995:2: (iv_ruleGroupedFeature= ruleGroupedFeature EOF )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:996:2: iv_ruleGroupedFeature= ruleGroupedFeature EOF
            {
             newCompositeNode(grammarAccess.getGroupedFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature2263);
            iv_ruleGroupedFeature=ruleGroupedFeature();

            state._fsp--;

             current =iv_ruleGroupedFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroupedFeature2273); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupedFeature"


    // $ANTLR start "ruleGroupedFeature"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1003:1: ruleGroupedFeature returns [EObject current=null] : (otherlv_0= '<fm:GroupedFeature fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_containsRelation_3_0= ruleRelationship ) )* ( (lv_annotation_4_0= ruleAnnotation ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:GroupedFeature>' (otherlv_7= '</fm:FeatureGroup>' )? ) ;
    public final EObject ruleGroupedFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_containsRelation_3_0 = null;

        EObject lv_annotation_4_0 = null;

        EObject lv_containsFeature_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1006:28: ( (otherlv_0= '<fm:GroupedFeature fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_containsRelation_3_0= ruleRelationship ) )* ( (lv_annotation_4_0= ruleAnnotation ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:GroupedFeature>' (otherlv_7= '</fm:FeatureGroup>' )? ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1007:1: (otherlv_0= '<fm:GroupedFeature fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_containsRelation_3_0= ruleRelationship ) )* ( (lv_annotation_4_0= ruleAnnotation ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:GroupedFeature>' (otherlv_7= '</fm:FeatureGroup>' )? )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1007:1: (otherlv_0= '<fm:GroupedFeature fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_containsRelation_3_0= ruleRelationship ) )* ( (lv_annotation_4_0= ruleAnnotation ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:GroupedFeature>' (otherlv_7= '</fm:FeatureGroup>' )? )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1007:3: otherlv_0= '<fm:GroupedFeature fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_containsRelation_3_0= ruleRelationship ) )* ( (lv_annotation_4_0= ruleAnnotation ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:GroupedFeature>' (otherlv_7= '</fm:FeatureGroup>' )?
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleGroupedFeature2310); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupedFeatureAccess().getFmGroupedFeatureFmValueKeyword_0());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1011:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1012:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1012:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1013:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleGroupedFeature2327); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGroupedFeatureAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupedFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGroupedFeature2344); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupedFeatureAccess().getGreaterThanSignKeyword_2());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1033:1: ( (lv_containsRelation_3_0= ruleRelationship ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24||(LA17_0>=30 && LA17_0<=33)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1034:1: (lv_containsRelation_3_0= ruleRelationship )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1034:1: (lv_containsRelation_3_0= ruleRelationship )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1035:3: lv_containsRelation_3_0= ruleRelationship
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getContainsRelationRelationshipParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_ruleGroupedFeature2365);
            	    lv_containsRelation_3_0=ruleRelationship();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containsRelation",
            	            		lv_containsRelation_3_0, 
            	            		"Relationship");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1051:3: ( (lv_annotation_4_0= ruleAnnotation ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1052:1: (lv_annotation_4_0= ruleAnnotation )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1052:1: (lv_annotation_4_0= ruleAnnotation )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1053:3: lv_annotation_4_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getAnnotationAnnotationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleGroupedFeature2387);
            	    lv_annotation_4_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotation",
            	            		lv_annotation_4_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1069:3: ( (lv_containsFeature_5_0= ruleFeature ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36||LA19_0==38||LA19_0==40||LA19_0==43) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1070:1: (lv_containsFeature_5_0= ruleFeature )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1070:1: (lv_containsFeature_5_0= ruleFeature )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1071:3: lv_containsFeature_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getContainsFeatureFeatureParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleGroupedFeature2409);
            	    lv_containsFeature_5_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containsFeature",
            	            		lv_containsFeature_5_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_6=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleGroupedFeature2422); 

                	newLeafNode(otherlv_6, grammarAccess.getGroupedFeatureAccess().getFmGroupedFeatureKeyword_6());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1091:1: (otherlv_7= '</fm:FeatureGroup>' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1091:3: otherlv_7= '</fm:FeatureGroup>'
                    {
                    otherlv_7=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleGroupedFeature2435); 

                        	newLeafNode(otherlv_7, grammarAccess.getGroupedFeatureAccess().getFmFeatureGroupKeyword_7());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupedFeature"


    // $ANTLR start "entryRuleGroupedReference"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1103:1: entryRuleGroupedReference returns [EObject current=null] : iv_ruleGroupedReference= ruleGroupedReference EOF ;
    public final EObject entryRuleGroupedReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupedReference = null;


        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1104:2: (iv_ruleGroupedReference= ruleGroupedReference EOF )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1105:2: iv_ruleGroupedReference= ruleGroupedReference EOF
            {
             newCompositeNode(grammarAccess.getGroupedReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedReference_in_entryRuleGroupedReference2473);
            iv_ruleGroupedReference=ruleGroupedReference();

            state._fsp--;

             current =iv_ruleGroupedReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroupedReference2483); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupedReference"


    // $ANTLR start "ruleGroupedReference"
    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1112:1: ruleGroupedReference returns [EObject current=null] : (otherlv_0= '<fm:GroupedReference fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_containsRelation_3_0= ruleRelationship ) )* ( (lv_annotation_4_0= ruleAnnotation ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:GroupedReference>' (otherlv_7= '</fm:FeatureGroup>' )? ) ;
    public final EObject ruleGroupedReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_containsRelation_3_0 = null;

        EObject lv_annotation_4_0 = null;

        EObject lv_containsFeature_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1115:28: ( (otherlv_0= '<fm:GroupedReference fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_containsRelation_3_0= ruleRelationship ) )* ( (lv_annotation_4_0= ruleAnnotation ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:GroupedReference>' (otherlv_7= '</fm:FeatureGroup>' )? ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1116:1: (otherlv_0= '<fm:GroupedReference fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_containsRelation_3_0= ruleRelationship ) )* ( (lv_annotation_4_0= ruleAnnotation ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:GroupedReference>' (otherlv_7= '</fm:FeatureGroup>' )? )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1116:1: (otherlv_0= '<fm:GroupedReference fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_containsRelation_3_0= ruleRelationship ) )* ( (lv_annotation_4_0= ruleAnnotation ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:GroupedReference>' (otherlv_7= '</fm:FeatureGroup>' )? )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1116:3: otherlv_0= '<fm:GroupedReference fm:value=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '>' ( (lv_containsRelation_3_0= ruleRelationship ) )* ( (lv_annotation_4_0= ruleAnnotation ) )* ( (lv_containsFeature_5_0= ruleFeature ) )* otherlv_6= '</fm:GroupedReference>' (otherlv_7= '</fm:FeatureGroup>' )?
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleGroupedReference2520); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupedReferenceAccess().getFmGroupedReferenceFmValueKeyword_0());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1120:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1121:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1121:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1122:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleGroupedReference2537); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGroupedReferenceAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupedReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGroupedReference2554); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupedReferenceAccess().getGreaterThanSignKeyword_2());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1142:1: ( (lv_containsRelation_3_0= ruleRelationship ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24||(LA21_0>=30 && LA21_0<=33)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1143:1: (lv_containsRelation_3_0= ruleRelationship )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1143:1: (lv_containsRelation_3_0= ruleRelationship )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1144:3: lv_containsRelation_3_0= ruleRelationship
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupedReferenceAccess().getContainsRelationRelationshipParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_ruleGroupedReference2575);
            	    lv_containsRelation_3_0=ruleRelationship();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupedReferenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containsRelation",
            	            		lv_containsRelation_3_0, 
            	            		"Relationship");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1160:3: ( (lv_annotation_4_0= ruleAnnotation ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1161:1: (lv_annotation_4_0= ruleAnnotation )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1161:1: (lv_annotation_4_0= ruleAnnotation )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1162:3: lv_annotation_4_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupedReferenceAccess().getAnnotationAnnotationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleGroupedReference2597);
            	    lv_annotation_4_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupedReferenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotation",
            	            		lv_annotation_4_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1178:3: ( (lv_containsFeature_5_0= ruleFeature ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36||LA23_0==38||LA23_0==40||LA23_0==43) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1179:1: (lv_containsFeature_5_0= ruleFeature )
            	    {
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1179:1: (lv_containsFeature_5_0= ruleFeature )
            	    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1180:3: lv_containsFeature_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupedReferenceAccess().getContainsFeatureFeatureParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleGroupedReference2619);
            	    lv_containsFeature_5_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupedReferenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containsFeature",
            	            		lv_containsFeature_5_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_6=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleGroupedReference2632); 

                	newLeafNode(otherlv_6, grammarAccess.getGroupedReferenceAccess().getFmGroupedReferenceKeyword_6());
                
            // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1200:1: (otherlv_7= '</fm:FeatureGroup>' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.featuremodel/src-gen/org/xtext/featuremodel/parser/antlr/internal/InternalFeatureModel.g:1200:3: otherlv_7= '</fm:FeatureGroup>'
                    {
                    otherlv_7=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleGroupedReference2645); 

                        	newLeafNode(otherlv_7, grammarAccess.getGroupedReferenceAccess().getFmFeatureGroupKeyword_7());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupedReference"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\13\uffff";
    static final String DFA5_eofS =
        "\13\uffff";
    static final String DFA5_minS =
        "\1\30\1\4\3\uffff\2\32\1\31\1\33\2\uffff";
    static final String DFA5_maxS =
        "\1\41\1\31\3\uffff\2\32\1\34\1\35\2\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\3\1\4\1\5\4\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\13\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\5\uffff\1\2\2\3\1\4",
            "\1\6\24\uffff\1\5",
            "",
            "",
            "",
            "\1\7",
            "\1\10",
            "\1\11\2\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "303:1: (this_Mandatory_0= ruleMandatory | this_Optional_1= ruleOptional | this_Alternative_2= ruleAlternative | this_Inclusive_Or_3= ruleInclusive_Or | this_GroupCardinality_4= ruleGroupCardinality )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFeatureModel_in_entryRuleFeatureModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleFeatureModel122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFeatureModel134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFeatureModel146 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFeatureModel158 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFeatureModel170 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleRootFeature_in_ruleFeatureModel191 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleFeatureModel204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRootFeature_in_entryRuleRootFeature240 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRootFeature250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleRootFeature287 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRootFeature304 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleRootFeature321 = new BitSet(new long[]{0x00000953C1180000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleRootFeature342 = new BitSet(new long[]{0x00000953C1180000L});
        public static final BitSet FOLLOW_ruleRelationship_in_ruleRootFeature364 = new BitSet(new long[]{0x00000953C1080000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleRootFeature386 = new BitSet(new long[]{0x0000095000080000L});
        public static final BitSet FOLLOW_19_in_ruleRootFeature399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation435 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleAnnotation482 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAnnotation494 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotation511 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleAnnotation528 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAnnotation540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship576 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationship586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMandatory_in_ruleRelationship633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptional_in_ruleRelationship660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternative_in_ruleRelationship687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInclusive_Or_in_ruleRelationship714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupCardinality_in_ruleRelationship741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory776 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMandatory786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleMandatory833 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleMandatory845 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleMandatory857 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleMandatory869 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMandatory881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleMandatory901 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMandatory918 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleMandatory935 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleMandatory953 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMandatory978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional1015 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptional1025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleOptional1072 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleOptional1084 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleOptional1096 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleOptional1108 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleOptional1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleOptional1140 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleOptional1157 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleOptional1174 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleOptional1192 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleOptional1217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlternative_in_entryRuleAlternative1254 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAlternative1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleAlternative1310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInclusive_Or_in_entryRuleInclusive_Or1346 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInclusive_Or1356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleInclusive_Or1403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleInclusive_Or1421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupCardinality_in_entryRuleGroupCardinality1458 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroupCardinality1468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleGroupCardinality1505 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleGroupCardinality1517 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleGroupCardinality1534 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleGroupCardinality1551 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleGroupCardinality1568 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleGroupCardinality1585 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleGroupCardinality1597 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleGroupCardinality1617 = new BitSet(new long[]{0x0000000800400000L});
        public static final BitSet FOLLOW_35_in_ruleGroupCardinality1630 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleGroupCardinality1650 = new BitSet(new long[]{0x0000000800400000L});
        public static final BitSet FOLLOW_22_in_ruleGroupCardinality1664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1700 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature1710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_Impl_in_ruleFeature1757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceFeature_in_ruleFeature1784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_ruleFeature1811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedReference_in_ruleFeature1838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_Impl_in_entryRuleFeature_Impl1873 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature_Impl1883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleFeature_Impl1920 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleFeature_Impl1937 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFeature_Impl1954 = new BitSet(new long[]{0x00000973C1100000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleFeature_Impl1975 = new BitSet(new long[]{0x00000973C1100000L});
        public static final BitSet FOLLOW_ruleRelationship_in_ruleFeature_Impl1997 = new BitSet(new long[]{0x00000973C1000000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleFeature_Impl2019 = new BitSet(new long[]{0x0000097000000000L});
        public static final BitSet FOLLOW_37_in_ruleFeature_Impl2032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceFeature_in_entryRuleReferenceFeature2068 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferenceFeature2078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleReferenceFeature2115 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleReferenceFeature2132 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleReferenceFeature2149 = new BitSet(new long[]{0x000009D3C1100000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleReferenceFeature2170 = new BitSet(new long[]{0x000009D3C1100000L});
        public static final BitSet FOLLOW_ruleRelationship_in_ruleReferenceFeature2192 = new BitSet(new long[]{0x000009D3C1000000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleReferenceFeature2214 = new BitSet(new long[]{0x000009D000000000L});
        public static final BitSet FOLLOW_39_in_ruleReferenceFeature2227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature2263 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroupedFeature2273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleGroupedFeature2310 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleGroupedFeature2327 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleGroupedFeature2344 = new BitSet(new long[]{0x00000B53C1100000L});
        public static final BitSet FOLLOW_ruleRelationship_in_ruleGroupedFeature2365 = new BitSet(new long[]{0x00000B53C1100000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleGroupedFeature2387 = new BitSet(new long[]{0x00000B5000100000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleGroupedFeature2409 = new BitSet(new long[]{0x00000B5000000000L});
        public static final BitSet FOLLOW_41_in_ruleGroupedFeature2422 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleGroupedFeature2435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedReference_in_entryRuleGroupedReference2473 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroupedReference2483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleGroupedReference2520 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleGroupedReference2537 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleGroupedReference2554 = new BitSet(new long[]{0x00001953C1100000L});
        public static final BitSet FOLLOW_ruleRelationship_in_ruleGroupedReference2575 = new BitSet(new long[]{0x00001953C1100000L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleGroupedReference2597 = new BitSet(new long[]{0x0000195000100000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleGroupedReference2619 = new BitSet(new long[]{0x0000195000000000L});
        public static final BitSet FOLLOW_44_in_ruleGroupedReference2632 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleGroupedReference2645 = new BitSet(new long[]{0x0000000000000002L});
    }


}