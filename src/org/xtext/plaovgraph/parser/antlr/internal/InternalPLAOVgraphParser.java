package org.xtext.plaovgraph.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.plaovgraph.services.PLAOVgraphGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPLAOVgraphParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Aspect_Oriented_Model'", "'{'", "'goalmodel'", "','", "'}'", "'Goal_Model'", "'element'", "'relationship'", "'property'", "'Element'", "'type'", "'Contribution'", "'label'", "'source'", "'target'", "'Correlation'", "'Crosscutting'", "'pointcut'", "'advice'", "'intertype'", "'Pointcut'", "'operand'", "'Advice'", "'joinpointAdvice'", "'('", "')'", "'idPointcut'", "'IntertypeDeclaration'", "'newElement'", "'newAttribute'", "'Operand'", "'primitive'", "'joinpointPointcut'", "'operator'", "'Operator'", "'Attribute'", "'value'", "'IsFeature'", "'Cardinality'", "'cardinalityMin'", "'cardinalityMax'", "'GroupFeature'", "'cardinalityGroupMin'", "'cardinalityGroupMax'", "'Generic_Property'", "'task'", "'goal'", "'softgoal'", "'task_ref'", "'goal_ref'", "'softgoal_ref'", "'and'", "'or'", "'xor'", "'inc_or'", "'make'", "'break'", "'help'", "'hurt'", "'unknown'", "'include'", "'substitute'", "'not'", "'around'", "'before'", "'after'", "'attribute'", "'no'", "'yes'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalPLAOVgraphParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPLAOVgraphParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPLAOVgraphParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g"; }



     	private PLAOVgraphGrammarAccess grammarAccess;
     	
        public InternalPLAOVgraphParser(TokenStream input, PLAOVgraphGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Aspect_Oriented_Model";	
       	}
       	
       	@Override
       	protected PLAOVgraphGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAspect_Oriented_Model"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:68:1: entryRuleAspect_Oriented_Model returns [EObject current=null] : iv_ruleAspect_Oriented_Model= ruleAspect_Oriented_Model EOF ;
    public final EObject entryRuleAspect_Oriented_Model() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect_Oriented_Model = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:69:2: (iv_ruleAspect_Oriented_Model= ruleAspect_Oriented_Model EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:70:2: iv_ruleAspect_Oriented_Model= ruleAspect_Oriented_Model EOF
            {
             newCompositeNode(grammarAccess.getAspect_Oriented_ModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAspect_Oriented_Model_in_entryRuleAspect_Oriented_Model75);
            iv_ruleAspect_Oriented_Model=ruleAspect_Oriented_Model();

            state._fsp--;

             current =iv_ruleAspect_Oriented_Model; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAspect_Oriented_Model85); 

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
    // $ANTLR end "entryRuleAspect_Oriented_Model"


    // $ANTLR start "ruleAspect_Oriented_Model"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:77:1: ruleAspect_Oriented_Model returns [EObject current=null] : (otherlv_0= 'Aspect_Oriented_Model' otherlv_1= '{' otherlv_2= 'goalmodel' otherlv_3= '{' ( (lv_goalmodel_4_0= ruleGoal_Model ) ) (otherlv_5= ',' ( (lv_goalmodel_6_0= ruleGoal_Model ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleAspect_Oriented_Model() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_goalmodel_4_0 = null;

        EObject lv_goalmodel_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:80:28: ( (otherlv_0= 'Aspect_Oriented_Model' otherlv_1= '{' otherlv_2= 'goalmodel' otherlv_3= '{' ( (lv_goalmodel_4_0= ruleGoal_Model ) ) (otherlv_5= ',' ( (lv_goalmodel_6_0= ruleGoal_Model ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:81:1: (otherlv_0= 'Aspect_Oriented_Model' otherlv_1= '{' otherlv_2= 'goalmodel' otherlv_3= '{' ( (lv_goalmodel_4_0= ruleGoal_Model ) ) (otherlv_5= ',' ( (lv_goalmodel_6_0= ruleGoal_Model ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:81:1: (otherlv_0= 'Aspect_Oriented_Model' otherlv_1= '{' otherlv_2= 'goalmodel' otherlv_3= '{' ( (lv_goalmodel_4_0= ruleGoal_Model ) ) (otherlv_5= ',' ( (lv_goalmodel_6_0= ruleGoal_Model ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:81:3: otherlv_0= 'Aspect_Oriented_Model' otherlv_1= '{' otherlv_2= 'goalmodel' otherlv_3= '{' ( (lv_goalmodel_4_0= ruleGoal_Model ) ) (otherlv_5= ',' ( (lv_goalmodel_6_0= ruleGoal_Model ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAspect_Oriented_Model122); 

                	newLeafNode(otherlv_0, grammarAccess.getAspect_Oriented_ModelAccess().getAspect_Oriented_ModelKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAspect_Oriented_Model134); 

                	newLeafNode(otherlv_1, grammarAccess.getAspect_Oriented_ModelAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAspect_Oriented_Model146); 

                	newLeafNode(otherlv_2, grammarAccess.getAspect_Oriented_ModelAccess().getGoalmodelKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAspect_Oriented_Model158); 

                	newLeafNode(otherlv_3, grammarAccess.getAspect_Oriented_ModelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:97:1: ( (lv_goalmodel_4_0= ruleGoal_Model ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:98:1: (lv_goalmodel_4_0= ruleGoal_Model )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:98:1: (lv_goalmodel_4_0= ruleGoal_Model )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:99:3: lv_goalmodel_4_0= ruleGoal_Model
            {
             
            	        newCompositeNode(grammarAccess.getAspect_Oriented_ModelAccess().getGoalmodelGoal_ModelParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGoal_Model_in_ruleAspect_Oriented_Model179);
            lv_goalmodel_4_0=ruleGoal_Model();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAspect_Oriented_ModelRule());
            	        }
                   		add(
                   			current, 
                   			"goalmodel",
                    		lv_goalmodel_4_0, 
                    		"Goal_Model");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:115:2: (otherlv_5= ',' ( (lv_goalmodel_6_0= ruleGoal_Model ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:115:4: otherlv_5= ',' ( (lv_goalmodel_6_0= ruleGoal_Model ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAspect_Oriented_Model192); 

            	        	newLeafNode(otherlv_5, grammarAccess.getAspect_Oriented_ModelAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:119:1: ( (lv_goalmodel_6_0= ruleGoal_Model ) )
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:120:1: (lv_goalmodel_6_0= ruleGoal_Model )
            	    {
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:120:1: (lv_goalmodel_6_0= ruleGoal_Model )
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:121:3: lv_goalmodel_6_0= ruleGoal_Model
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAspect_Oriented_ModelAccess().getGoalmodelGoal_ModelParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleGoal_Model_in_ruleAspect_Oriented_Model213);
            	    lv_goalmodel_6_0=ruleGoal_Model();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAspect_Oriented_ModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"goalmodel",
            	            		lv_goalmodel_6_0, 
            	            		"Goal_Model");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAspect_Oriented_Model227); 

                	newLeafNode(otherlv_7, grammarAccess.getAspect_Oriented_ModelAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAspect_Oriented_Model239); 

                	newLeafNode(otherlv_8, grammarAccess.getAspect_Oriented_ModelAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleAspect_Oriented_Model"


    // $ANTLR start "entryRuleGoal_Model"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:153:1: entryRuleGoal_Model returns [EObject current=null] : iv_ruleGoal_Model= ruleGoal_Model EOF ;
    public final EObject entryRuleGoal_Model() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal_Model = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:154:2: (iv_ruleGoal_Model= ruleGoal_Model EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:155:2: iv_ruleGoal_Model= ruleGoal_Model EOF
            {
             newCompositeNode(grammarAccess.getGoal_ModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGoal_Model_in_entryRuleGoal_Model275);
            iv_ruleGoal_Model=ruleGoal_Model();

            state._fsp--;

             current =iv_ruleGoal_Model; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGoal_Model285); 

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
    // $ANTLR end "entryRuleGoal_Model"


    // $ANTLR start "ruleGoal_Model"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:162:1: ruleGoal_Model returns [EObject current=null] : (this_Goal_Model_Impl_0= ruleGoal_Model_Impl | this_Element_1= ruleElement ) ;
    public final EObject ruleGoal_Model() throws RecognitionException {
        EObject current = null;

        EObject this_Goal_Model_Impl_0 = null;

        EObject this_Element_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:165:28: ( (this_Goal_Model_Impl_0= ruleGoal_Model_Impl | this_Element_1= ruleElement ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:166:1: (this_Goal_Model_Impl_0= ruleGoal_Model_Impl | this_Element_1= ruleElement )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:166:1: (this_Goal_Model_Impl_0= ruleGoal_Model_Impl | this_Element_1= ruleElement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:167:5: this_Goal_Model_Impl_0= ruleGoal_Model_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getGoal_ModelAccess().getGoal_Model_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGoal_Model_Impl_in_ruleGoal_Model332);
                    this_Goal_Model_Impl_0=ruleGoal_Model_Impl();

                    state._fsp--;

                     
                            current = this_Goal_Model_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:177:5: this_Element_1= ruleElement
                    {
                     
                            newCompositeNode(grammarAccess.getGoal_ModelAccess().getElementParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleGoal_Model359);
                    this_Element_1=ruleElement();

                    state._fsp--;

                     
                            current = this_Element_1; 
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
    // $ANTLR end "ruleGoal_Model"


    // $ANTLR start "entryRuleRelationship"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:193:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:194:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:195:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_entryRuleRelationship394);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationship404); 

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
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:202:1: ruleRelationship returns [EObject current=null] : (this_Contribution_0= ruleContribution | this_Correlation_1= ruleCorrelation | this_Crosscutting_2= ruleCrosscutting ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Contribution_0 = null;

        EObject this_Correlation_1 = null;

        EObject this_Crosscutting_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:205:28: ( (this_Contribution_0= ruleContribution | this_Correlation_1= ruleCorrelation | this_Crosscutting_2= ruleCrosscutting ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:206:1: (this_Contribution_0= ruleContribution | this_Correlation_1= ruleCorrelation | this_Crosscutting_2= ruleCrosscutting )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:206:1: (this_Contribution_0= ruleContribution | this_Correlation_1= ruleCorrelation | this_Crosscutting_2= ruleCrosscutting )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:207:5: this_Contribution_0= ruleContribution
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getContributionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleContribution_in_ruleRelationship451);
                    this_Contribution_0=ruleContribution();

                    state._fsp--;

                     
                            current = this_Contribution_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:217:5: this_Correlation_1= ruleCorrelation
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getCorrelationParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCorrelation_in_ruleRelationship478);
                    this_Correlation_1=ruleCorrelation();

                    state._fsp--;

                     
                            current = this_Correlation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:227:5: this_Crosscutting_2= ruleCrosscutting
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getCrosscuttingParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCrosscutting_in_ruleRelationship505);
                    this_Crosscutting_2=ruleCrosscutting();

                    state._fsp--;

                     
                            current = this_Crosscutting_2; 
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


    // $ANTLR start "entryRuleProperty"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:243:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:244:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:245:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty540);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty550); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:252:1: ruleProperty returns [EObject current=null] : (this_IsFeature_0= ruleIsFeature | this_Cardinality_1= ruleCardinality | this_GroupFeature_2= ruleGroupFeature | this_Generic_Property_3= ruleGeneric_Property ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_IsFeature_0 = null;

        EObject this_Cardinality_1 = null;

        EObject this_GroupFeature_2 = null;

        EObject this_Generic_Property_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:255:28: ( (this_IsFeature_0= ruleIsFeature | this_Cardinality_1= ruleCardinality | this_GroupFeature_2= ruleGroupFeature | this_Generic_Property_3= ruleGeneric_Property ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:256:1: (this_IsFeature_0= ruleIsFeature | this_Cardinality_1= ruleCardinality | this_GroupFeature_2= ruleGroupFeature | this_Generic_Property_3= ruleGeneric_Property )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:256:1: (this_IsFeature_0= ruleIsFeature | this_Cardinality_1= ruleCardinality | this_GroupFeature_2= ruleGroupFeature | this_Generic_Property_3= ruleGeneric_Property )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt4=1;
                }
                break;
            case 49:
                {
                alt4=2;
                }
                break;
            case 52:
                {
                alt4=3;
                }
                break;
            case 55:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:257:5: this_IsFeature_0= ruleIsFeature
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getIsFeatureParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIsFeature_in_ruleProperty597);
                    this_IsFeature_0=ruleIsFeature();

                    state._fsp--;

                     
                            current = this_IsFeature_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:267:5: this_Cardinality_1= ruleCardinality
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getCardinalityParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCardinality_in_ruleProperty624);
                    this_Cardinality_1=ruleCardinality();

                    state._fsp--;

                     
                            current = this_Cardinality_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:277:5: this_GroupFeature_2= ruleGroupFeature
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getGroupFeatureParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGroupFeature_in_ruleProperty651);
                    this_GroupFeature_2=ruleGroupFeature();

                    state._fsp--;

                     
                            current = this_GroupFeature_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:287:5: this_Generic_Property_3= ruleGeneric_Property
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getGeneric_PropertyParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGeneric_Property_in_ruleProperty678);
                    this_Generic_Property_3=ruleGeneric_Property();

                    state._fsp--;

                     
                            current = this_Generic_Property_3; 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleGoal_Model_Impl"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:303:1: entryRuleGoal_Model_Impl returns [EObject current=null] : iv_ruleGoal_Model_Impl= ruleGoal_Model_Impl EOF ;
    public final EObject entryRuleGoal_Model_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal_Model_Impl = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:304:2: (iv_ruleGoal_Model_Impl= ruleGoal_Model_Impl EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:305:2: iv_ruleGoal_Model_Impl= ruleGoal_Model_Impl EOF
            {
             newCompositeNode(grammarAccess.getGoal_Model_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGoal_Model_Impl_in_entryRuleGoal_Model_Impl713);
            iv_ruleGoal_Model_Impl=ruleGoal_Model_Impl();

            state._fsp--;

             current =iv_ruleGoal_Model_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGoal_Model_Impl723); 

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
    // $ANTLR end "entryRuleGoal_Model_Impl"


    // $ANTLR start "ruleGoal_Model_Impl"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:312:1: ruleGoal_Model_Impl returns [EObject current=null] : ( () otherlv_1= 'Goal_Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'element' otherlv_5= '{' ( (lv_element_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_element_8_0= ruleElement ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationship' otherlv_11= '{' ( (lv_relationship_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationship_14_0= ruleRelationship ) ) )* otherlv_15= '}' )? (otherlv_16= 'property' otherlv_17= '{' ( (lv_property_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_property_20_0= ruleProperty ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleGoal_Model_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_element_6_0 = null;

        EObject lv_element_8_0 = null;

        EObject lv_relationship_12_0 = null;

        EObject lv_relationship_14_0 = null;

        EObject lv_property_18_0 = null;

        EObject lv_property_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:315:28: ( ( () otherlv_1= 'Goal_Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'element' otherlv_5= '{' ( (lv_element_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_element_8_0= ruleElement ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationship' otherlv_11= '{' ( (lv_relationship_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationship_14_0= ruleRelationship ) ) )* otherlv_15= '}' )? (otherlv_16= 'property' otherlv_17= '{' ( (lv_property_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_property_20_0= ruleProperty ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:316:1: ( () otherlv_1= 'Goal_Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'element' otherlv_5= '{' ( (lv_element_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_element_8_0= ruleElement ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationship' otherlv_11= '{' ( (lv_relationship_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationship_14_0= ruleRelationship ) ) )* otherlv_15= '}' )? (otherlv_16= 'property' otherlv_17= '{' ( (lv_property_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_property_20_0= ruleProperty ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:316:1: ( () otherlv_1= 'Goal_Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'element' otherlv_5= '{' ( (lv_element_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_element_8_0= ruleElement ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationship' otherlv_11= '{' ( (lv_relationship_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationship_14_0= ruleRelationship ) ) )* otherlv_15= '}' )? (otherlv_16= 'property' otherlv_17= '{' ( (lv_property_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_property_20_0= ruleProperty ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:316:2: () otherlv_1= 'Goal_Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'element' otherlv_5= '{' ( (lv_element_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_element_8_0= ruleElement ) ) )* otherlv_9= '}' )? (otherlv_10= 'relationship' otherlv_11= '{' ( (lv_relationship_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationship_14_0= ruleRelationship ) ) )* otherlv_15= '}' )? (otherlv_16= 'property' otherlv_17= '{' ( (lv_property_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_property_20_0= ruleProperty ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:316:2: ()
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:317:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGoal_Model_ImplAccess().getGoal_ModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGoal_Model_Impl769); 

                	newLeafNode(otherlv_1, grammarAccess.getGoal_Model_ImplAccess().getGoal_ModelKeyword_1());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:326:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:327:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:327:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:328:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGoal_Model_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGoal_Model_Impl790);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGoal_Model_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGoal_Model_Impl802); 

                	newLeafNode(otherlv_3, grammarAccess.getGoal_Model_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:348:1: (otherlv_4= 'element' otherlv_5= '{' ( (lv_element_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_element_8_0= ruleElement ) ) )* otherlv_9= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:348:3: otherlv_4= 'element' otherlv_5= '{' ( (lv_element_6_0= ruleElement ) ) (otherlv_7= ',' ( (lv_element_8_0= ruleElement ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGoal_Model_Impl815); 

                        	newLeafNode(otherlv_4, grammarAccess.getGoal_Model_ImplAccess().getElementKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGoal_Model_Impl827); 

                        	newLeafNode(otherlv_5, grammarAccess.getGoal_Model_ImplAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:356:1: ( (lv_element_6_0= ruleElement ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:357:1: (lv_element_6_0= ruleElement )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:357:1: (lv_element_6_0= ruleElement )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:358:3: lv_element_6_0= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getGoal_Model_ImplAccess().getElementElementParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleGoal_Model_Impl848);
                    lv_element_6_0=ruleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGoal_Model_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"element",
                            		lv_element_6_0, 
                            		"Element");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:374:2: (otherlv_7= ',' ( (lv_element_8_0= ruleElement ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:374:4: otherlv_7= ',' ( (lv_element_8_0= ruleElement ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGoal_Model_Impl861); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getGoal_Model_ImplAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:378:1: ( (lv_element_8_0= ruleElement ) )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:379:1: (lv_element_8_0= ruleElement )
                    	    {
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:379:1: (lv_element_8_0= ruleElement )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:380:3: lv_element_8_0= ruleElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGoal_Model_ImplAccess().getElementElementParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleGoal_Model_Impl882);
                    	    lv_element_8_0=ruleElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGoal_Model_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"element",
                    	            		lv_element_8_0, 
                    	            		"Element");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGoal_Model_Impl896); 

                        	newLeafNode(otherlv_9, grammarAccess.getGoal_Model_ImplAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:400:3: (otherlv_10= 'relationship' otherlv_11= '{' ( (lv_relationship_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationship_14_0= ruleRelationship ) ) )* otherlv_15= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:400:5: otherlv_10= 'relationship' otherlv_11= '{' ( (lv_relationship_12_0= ruleRelationship ) ) (otherlv_13= ',' ( (lv_relationship_14_0= ruleRelationship ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGoal_Model_Impl911); 

                        	newLeafNode(otherlv_10, grammarAccess.getGoal_Model_ImplAccess().getRelationshipKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGoal_Model_Impl923); 

                        	newLeafNode(otherlv_11, grammarAccess.getGoal_Model_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:408:1: ( (lv_relationship_12_0= ruleRelationship ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:409:1: (lv_relationship_12_0= ruleRelationship )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:409:1: (lv_relationship_12_0= ruleRelationship )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:410:3: lv_relationship_12_0= ruleRelationship
                    {
                     
                    	        newCompositeNode(grammarAccess.getGoal_Model_ImplAccess().getRelationshipRelationshipParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_ruleGoal_Model_Impl944);
                    lv_relationship_12_0=ruleRelationship();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGoal_Model_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"relationship",
                            		lv_relationship_12_0, 
                            		"Relationship");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:426:2: (otherlv_13= ',' ( (lv_relationship_14_0= ruleRelationship ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:426:4: otherlv_13= ',' ( (lv_relationship_14_0= ruleRelationship ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGoal_Model_Impl957); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getGoal_Model_ImplAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:430:1: ( (lv_relationship_14_0= ruleRelationship ) )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:431:1: (lv_relationship_14_0= ruleRelationship )
                    	    {
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:431:1: (lv_relationship_14_0= ruleRelationship )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:432:3: lv_relationship_14_0= ruleRelationship
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGoal_Model_ImplAccess().getRelationshipRelationshipParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_ruleGoal_Model_Impl978);
                    	    lv_relationship_14_0=ruleRelationship();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGoal_Model_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"relationship",
                    	            		lv_relationship_14_0, 
                    	            		"Relationship");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGoal_Model_Impl992); 

                        	newLeafNode(otherlv_15, grammarAccess.getGoal_Model_ImplAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:452:3: (otherlv_16= 'property' otherlv_17= '{' ( (lv_property_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_property_20_0= ruleProperty ) ) )* otherlv_21= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:452:5: otherlv_16= 'property' otherlv_17= '{' ( (lv_property_18_0= ruleProperty ) ) (otherlv_19= ',' ( (lv_property_20_0= ruleProperty ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGoal_Model_Impl1007); 

                        	newLeafNode(otherlv_16, grammarAccess.getGoal_Model_ImplAccess().getPropertyKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGoal_Model_Impl1019); 

                        	newLeafNode(otherlv_17, grammarAccess.getGoal_Model_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:460:1: ( (lv_property_18_0= ruleProperty ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:461:1: (lv_property_18_0= ruleProperty )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:461:1: (lv_property_18_0= ruleProperty )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:462:3: lv_property_18_0= ruleProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getGoal_Model_ImplAccess().getPropertyPropertyParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleGoal_Model_Impl1040);
                    lv_property_18_0=ruleProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGoal_Model_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"property",
                            		lv_property_18_0, 
                            		"Property");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:478:2: (otherlv_19= ',' ( (lv_property_20_0= ruleProperty ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:478:4: otherlv_19= ',' ( (lv_property_20_0= ruleProperty ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGoal_Model_Impl1053); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getGoal_Model_ImplAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:482:1: ( (lv_property_20_0= ruleProperty ) )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:483:1: (lv_property_20_0= ruleProperty )
                    	    {
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:483:1: (lv_property_20_0= ruleProperty )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:484:3: lv_property_20_0= ruleProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGoal_Model_ImplAccess().getPropertyPropertyParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleGoal_Model_Impl1074);
                    	    lv_property_20_0=ruleProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGoal_Model_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"property",
                    	            		lv_property_20_0, 
                    	            		"Property");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGoal_Model_Impl1088); 

                        	newLeafNode(otherlv_21, grammarAccess.getGoal_Model_ImplAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGoal_Model_Impl1102); 

                	newLeafNode(otherlv_22, grammarAccess.getGoal_Model_ImplAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleGoal_Model_Impl"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:516:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:517:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:518:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1139);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1150); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:525:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:528:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:529:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:529:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:529:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1190); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:537:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1216); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleElement"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:552:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:553:2: (iv_ruleElement= ruleElement EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:554:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement1261);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement1271); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:561:1: ruleElement returns [EObject current=null] : (otherlv_0= 'Element' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleElementTypes ) ) (otherlv_5= 'element' otherlv_6= '{' ( (lv_element_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )* otherlv_10= '}' )? (otherlv_11= 'relationship' otherlv_12= '{' ( (lv_relationship_13_0= ruleRelationship ) ) (otherlv_14= ',' ( (lv_relationship_15_0= ruleRelationship ) ) )* otherlv_16= '}' )? (otherlv_17= 'property' otherlv_18= '{' ( (lv_property_19_0= ruleProperty ) ) (otherlv_20= ',' ( (lv_property_21_0= ruleProperty ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;

        EObject lv_element_7_0 = null;

        EObject lv_element_9_0 = null;

        EObject lv_relationship_13_0 = null;

        EObject lv_relationship_15_0 = null;

        EObject lv_property_19_0 = null;

        EObject lv_property_21_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:564:28: ( (otherlv_0= 'Element' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleElementTypes ) ) (otherlv_5= 'element' otherlv_6= '{' ( (lv_element_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )* otherlv_10= '}' )? (otherlv_11= 'relationship' otherlv_12= '{' ( (lv_relationship_13_0= ruleRelationship ) ) (otherlv_14= ',' ( (lv_relationship_15_0= ruleRelationship ) ) )* otherlv_16= '}' )? (otherlv_17= 'property' otherlv_18= '{' ( (lv_property_19_0= ruleProperty ) ) (otherlv_20= ',' ( (lv_property_21_0= ruleProperty ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:565:1: (otherlv_0= 'Element' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleElementTypes ) ) (otherlv_5= 'element' otherlv_6= '{' ( (lv_element_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )* otherlv_10= '}' )? (otherlv_11= 'relationship' otherlv_12= '{' ( (lv_relationship_13_0= ruleRelationship ) ) (otherlv_14= ',' ( (lv_relationship_15_0= ruleRelationship ) ) )* otherlv_16= '}' )? (otherlv_17= 'property' otherlv_18= '{' ( (lv_property_19_0= ruleProperty ) ) (otherlv_20= ',' ( (lv_property_21_0= ruleProperty ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:565:1: (otherlv_0= 'Element' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleElementTypes ) ) (otherlv_5= 'element' otherlv_6= '{' ( (lv_element_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )* otherlv_10= '}' )? (otherlv_11= 'relationship' otherlv_12= '{' ( (lv_relationship_13_0= ruleRelationship ) ) (otherlv_14= ',' ( (lv_relationship_15_0= ruleRelationship ) ) )* otherlv_16= '}' )? (otherlv_17= 'property' otherlv_18= '{' ( (lv_property_19_0= ruleProperty ) ) (otherlv_20= ',' ( (lv_property_21_0= ruleProperty ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:565:3: otherlv_0= 'Element' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleElementTypes ) ) (otherlv_5= 'element' otherlv_6= '{' ( (lv_element_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )* otherlv_10= '}' )? (otherlv_11= 'relationship' otherlv_12= '{' ( (lv_relationship_13_0= ruleRelationship ) ) (otherlv_14= ',' ( (lv_relationship_15_0= ruleRelationship ) ) )* otherlv_16= '}' )? (otherlv_17= 'property' otherlv_18= '{' ( (lv_property_19_0= ruleProperty ) ) (otherlv_20= ',' ( (lv_property_21_0= ruleProperty ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleElement1308); 

                	newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:569:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:570:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:570:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:571:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getElementAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleElement1329);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement1341); 

                	newLeafNode(otherlv_2, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleElement1353); 

                	newLeafNode(otherlv_3, grammarAccess.getElementAccess().getTypeKeyword_3());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:595:1: ( (lv_type_4_0= ruleElementTypes ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:596:1: (lv_type_4_0= ruleElementTypes )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:596:1: (lv_type_4_0= ruleElementTypes )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:597:3: lv_type_4_0= ruleElementTypes
            {
             
            	        newCompositeNode(grammarAccess.getElementAccess().getTypeElementTypesEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleElementTypes_in_ruleElement1374);
            lv_type_4_0=ruleElementTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
                    		"ElementTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:613:2: (otherlv_5= 'element' otherlv_6= '{' ( (lv_element_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )* otherlv_10= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:613:4: otherlv_5= 'element' otherlv_6= '{' ( (lv_element_7_0= ruleElement ) ) (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleElement1387); 

                        	newLeafNode(otherlv_5, grammarAccess.getElementAccess().getElementKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement1399); 

                        	newLeafNode(otherlv_6, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:621:1: ( (lv_element_7_0= ruleElement ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:622:1: (lv_element_7_0= ruleElement )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:622:1: (lv_element_7_0= ruleElement )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:623:3: lv_element_7_0= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementAccess().getElementElementParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleElement1420);
                    lv_element_7_0=ruleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	        }
                           		add(
                           			current, 
                           			"element",
                            		lv_element_7_0, 
                            		"Element");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:639:2: (otherlv_8= ',' ( (lv_element_9_0= ruleElement ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:639:4: otherlv_8= ',' ( (lv_element_9_0= ruleElement ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleElement1433); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getElementAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:643:1: ( (lv_element_9_0= ruleElement ) )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:644:1: (lv_element_9_0= ruleElement )
                    	    {
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:644:1: (lv_element_9_0= ruleElement )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:645:3: lv_element_9_0= ruleElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElementAccess().getElementElementParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleElement1454);
                    	    lv_element_9_0=ruleElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"element",
                    	            		lv_element_9_0, 
                    	            		"Element");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElement1468); 

                        	newLeafNode(otherlv_10, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:665:3: (otherlv_11= 'relationship' otherlv_12= '{' ( (lv_relationship_13_0= ruleRelationship ) ) (otherlv_14= ',' ( (lv_relationship_15_0= ruleRelationship ) ) )* otherlv_16= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:665:5: otherlv_11= 'relationship' otherlv_12= '{' ( (lv_relationship_13_0= ruleRelationship ) ) (otherlv_14= ',' ( (lv_relationship_15_0= ruleRelationship ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleElement1483); 

                        	newLeafNode(otherlv_11, grammarAccess.getElementAccess().getRelationshipKeyword_6_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement1495); 

                        	newLeafNode(otherlv_12, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:673:1: ( (lv_relationship_13_0= ruleRelationship ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:674:1: (lv_relationship_13_0= ruleRelationship )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:674:1: (lv_relationship_13_0= ruleRelationship )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:675:3: lv_relationship_13_0= ruleRelationship
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementAccess().getRelationshipRelationshipParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_ruleElement1516);
                    lv_relationship_13_0=ruleRelationship();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	        }
                           		add(
                           			current, 
                           			"relationship",
                            		lv_relationship_13_0, 
                            		"Relationship");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:691:2: (otherlv_14= ',' ( (lv_relationship_15_0= ruleRelationship ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:691:4: otherlv_14= ',' ( (lv_relationship_15_0= ruleRelationship ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleElement1529); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getElementAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:695:1: ( (lv_relationship_15_0= ruleRelationship ) )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:696:1: (lv_relationship_15_0= ruleRelationship )
                    	    {
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:696:1: (lv_relationship_15_0= ruleRelationship )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:697:3: lv_relationship_15_0= ruleRelationship
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElementAccess().getRelationshipRelationshipParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_ruleElement1550);
                    	    lv_relationship_15_0=ruleRelationship();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"relationship",
                    	            		lv_relationship_15_0, 
                    	            		"Relationship");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElement1564); 

                        	newLeafNode(otherlv_16, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:717:3: (otherlv_17= 'property' otherlv_18= '{' ( (lv_property_19_0= ruleProperty ) ) (otherlv_20= ',' ( (lv_property_21_0= ruleProperty ) ) )* otherlv_22= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:717:5: otherlv_17= 'property' otherlv_18= '{' ( (lv_property_19_0= ruleProperty ) ) (otherlv_20= ',' ( (lv_property_21_0= ruleProperty ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleElement1579); 

                        	newLeafNode(otherlv_17, grammarAccess.getElementAccess().getPropertyKeyword_7_0());
                        
                    otherlv_18=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElement1591); 

                        	newLeafNode(otherlv_18, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:725:1: ( (lv_property_19_0= ruleProperty ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:726:1: (lv_property_19_0= ruleProperty )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:726:1: (lv_property_19_0= ruleProperty )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:727:3: lv_property_19_0= ruleProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementAccess().getPropertyPropertyParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleElement1612);
                    lv_property_19_0=ruleProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	        }
                           		add(
                           			current, 
                           			"property",
                            		lv_property_19_0, 
                            		"Property");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:743:2: (otherlv_20= ',' ( (lv_property_21_0= ruleProperty ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:743:4: otherlv_20= ',' ( (lv_property_21_0= ruleProperty ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleElement1625); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getElementAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:747:1: ( (lv_property_21_0= ruleProperty ) )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:748:1: (lv_property_21_0= ruleProperty )
                    	    {
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:748:1: (lv_property_21_0= ruleProperty )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:749:3: lv_property_21_0= ruleProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElementAccess().getPropertyPropertyParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleElement1646);
                    	    lv_property_21_0=ruleProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"property",
                    	            		lv_property_21_0, 
                    	            		"Property");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElement1660); 

                        	newLeafNode(otherlv_22, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElement1674); 

                	newLeafNode(otherlv_23, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleContribution"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:781:1: entryRuleContribution returns [EObject current=null] : iv_ruleContribution= ruleContribution EOF ;
    public final EObject entryRuleContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContribution = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:782:2: (iv_ruleContribution= ruleContribution EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:783:2: iv_ruleContribution= ruleContribution EOF
            {
             newCompositeNode(grammarAccess.getContributionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContribution_in_entryRuleContribution1710);
            iv_ruleContribution=ruleContribution();

            state._fsp--;

             current =iv_ruleContribution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContribution1720); 

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
    // $ANTLR end "entryRuleContribution"


    // $ANTLR start "ruleContribution"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:790:1: ruleContribution returns [EObject current=null] : (otherlv_0= 'Contribution' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= ruleDecompositionCategory ) ) (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleContribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_label_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:793:28: ( (otherlv_0= 'Contribution' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= ruleDecompositionCategory ) ) (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:794:1: (otherlv_0= 'Contribution' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= ruleDecompositionCategory ) ) (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:794:1: (otherlv_0= 'Contribution' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= ruleDecompositionCategory ) ) (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:794:3: otherlv_0= 'Contribution' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= ruleDecompositionCategory ) ) (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleContribution1757); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionAccess().getContributionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContribution1769); 

                	newLeafNode(otherlv_1, grammarAccess.getContributionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleContribution1781); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionAccess().getLabelKeyword_2());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:806:1: ( (lv_label_3_0= ruleDecompositionCategory ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:807:1: (lv_label_3_0= ruleDecompositionCategory )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:807:1: (lv_label_3_0= ruleDecompositionCategory )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:808:3: lv_label_3_0= ruleDecompositionCategory
            {
             
            	        newCompositeNode(grammarAccess.getContributionAccess().getLabelDecompositionCategoryEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDecompositionCategory_in_ruleContribution1802);
            lv_label_3_0=ruleDecompositionCategory();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContributionRule());
            	        }
                   		set(
                   			current, 
                   			"label",
                    		lv_label_3_0, 
                    		"DecompositionCategory");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:824:2: (otherlv_4= 'source' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:824:4: otherlv_4= 'source' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleContribution1815); 

                        	newLeafNode(otherlv_4, grammarAccess.getContributionAccess().getSourceKeyword_4_0());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:828:1: ( ( ruleEString ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:829:1: ( ruleEString )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:829:1: ( ruleEString )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:830:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContributionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getContributionAccess().getSourceGoal_ModelCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContribution1838);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:843:4: (otherlv_6= 'target' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:843:6: otherlv_6= 'target' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleContribution1853); 

                        	newLeafNode(otherlv_6, grammarAccess.getContributionAccess().getTargetKeyword_5_0());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:847:1: ( ( ruleEString ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:848:1: ( ruleEString )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:848:1: ( ruleEString )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:849:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContributionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getContributionAccess().getTargetGoal_ModelCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContribution1876);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleContribution1890); 

                	newLeafNode(otherlv_8, grammarAccess.getContributionAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleContribution"


    // $ANTLR start "entryRuleCorrelation"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:874:1: entryRuleCorrelation returns [EObject current=null] : iv_ruleCorrelation= ruleCorrelation EOF ;
    public final EObject entryRuleCorrelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorrelation = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:875:2: (iv_ruleCorrelation= ruleCorrelation EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:876:2: iv_ruleCorrelation= ruleCorrelation EOF
            {
             newCompositeNode(grammarAccess.getCorrelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCorrelation_in_entryRuleCorrelation1926);
            iv_ruleCorrelation=ruleCorrelation();

            state._fsp--;

             current =iv_ruleCorrelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCorrelation1936); 

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
    // $ANTLR end "entryRuleCorrelation"


    // $ANTLR start "ruleCorrelation"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:883:1: ruleCorrelation returns [EObject current=null] : (otherlv_0= 'Correlation' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= ruleCorrelationCategory ) ) (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleCorrelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_label_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:886:28: ( (otherlv_0= 'Correlation' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= ruleCorrelationCategory ) ) (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:887:1: (otherlv_0= 'Correlation' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= ruleCorrelationCategory ) ) (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:887:1: (otherlv_0= 'Correlation' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= ruleCorrelationCategory ) ) (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:887:3: otherlv_0= 'Correlation' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= ruleCorrelationCategory ) ) (otherlv_4= 'source' ( ( ruleEString ) ) )? (otherlv_6= 'target' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCorrelation1973); 

                	newLeafNode(otherlv_0, grammarAccess.getCorrelationAccess().getCorrelationKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCorrelation1985); 

                	newLeafNode(otherlv_1, grammarAccess.getCorrelationAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCorrelation1997); 

                	newLeafNode(otherlv_2, grammarAccess.getCorrelationAccess().getLabelKeyword_2());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:899:1: ( (lv_label_3_0= ruleCorrelationCategory ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:900:1: (lv_label_3_0= ruleCorrelationCategory )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:900:1: (lv_label_3_0= ruleCorrelationCategory )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:901:3: lv_label_3_0= ruleCorrelationCategory
            {
             
            	        newCompositeNode(grammarAccess.getCorrelationAccess().getLabelCorrelationCategoryEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCorrelationCategory_in_ruleCorrelation2018);
            lv_label_3_0=ruleCorrelationCategory();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCorrelationRule());
            	        }
                   		set(
                   			current, 
                   			"label",
                    		lv_label_3_0, 
                    		"CorrelationCategory");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:917:2: (otherlv_4= 'source' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:917:4: otherlv_4= 'source' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCorrelation2031); 

                        	newLeafNode(otherlv_4, grammarAccess.getCorrelationAccess().getSourceKeyword_4_0());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:921:1: ( ( ruleEString ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:922:1: ( ruleEString )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:922:1: ( ruleEString )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:923:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCorrelationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCorrelationAccess().getSourceGoal_ModelCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCorrelation2054);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:936:4: (otherlv_6= 'target' ( ( ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:936:6: otherlv_6= 'target' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCorrelation2069); 

                        	newLeafNode(otherlv_6, grammarAccess.getCorrelationAccess().getTargetKeyword_5_0());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:940:1: ( ( ruleEString ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:941:1: ( ruleEString )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:941:1: ( ruleEString )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:942:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCorrelationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCorrelationAccess().getTargetGoal_ModelCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCorrelation2092);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCorrelation2106); 

                	newLeafNode(otherlv_8, grammarAccess.getCorrelationAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleCorrelation"


    // $ANTLR start "entryRuleCrosscutting"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:967:1: entryRuleCrosscutting returns [EObject current=null] : iv_ruleCrosscutting= ruleCrosscutting EOF ;
    public final EObject entryRuleCrosscutting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrosscutting = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:968:2: (iv_ruleCrosscutting= ruleCrosscutting EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:969:2: iv_ruleCrosscutting= ruleCrosscutting EOF
            {
             newCompositeNode(grammarAccess.getCrosscuttingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCrosscutting_in_entryRuleCrosscutting2142);
            iv_ruleCrosscutting=ruleCrosscutting();

            state._fsp--;

             current =iv_ruleCrosscutting; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCrosscutting2152); 

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
    // $ANTLR end "entryRuleCrosscutting"


    // $ANTLR start "ruleCrosscutting"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:976:1: ruleCrosscutting returns [EObject current=null] : (otherlv_0= 'Crosscutting' otherlv_1= '{' (otherlv_2= 'source' ( ( ruleEString ) ) )? (otherlv_4= 'target' ( ( ruleEString ) ) )? otherlv_6= 'pointcut' otherlv_7= '{' ( (lv_pointcut_8_0= rulePointcut ) ) (otherlv_9= ',' ( (lv_pointcut_10_0= rulePointcut ) ) )* otherlv_11= '}' (otherlv_12= 'advice' otherlv_13= '{' ( (lv_advice_14_0= ruleAdvice ) ) (otherlv_15= ',' ( (lv_advice_16_0= ruleAdvice ) ) )* otherlv_17= '}' )? (otherlv_18= 'intertype' otherlv_19= '{' ( (lv_intertype_20_0= ruleIntertypeDeclaration ) ) (otherlv_21= ',' ( (lv_intertype_22_0= ruleIntertypeDeclaration ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleCrosscutting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_pointcut_8_0 = null;

        EObject lv_pointcut_10_0 = null;

        EObject lv_advice_14_0 = null;

        EObject lv_advice_16_0 = null;

        EObject lv_intertype_20_0 = null;

        EObject lv_intertype_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:979:28: ( (otherlv_0= 'Crosscutting' otherlv_1= '{' (otherlv_2= 'source' ( ( ruleEString ) ) )? (otherlv_4= 'target' ( ( ruleEString ) ) )? otherlv_6= 'pointcut' otherlv_7= '{' ( (lv_pointcut_8_0= rulePointcut ) ) (otherlv_9= ',' ( (lv_pointcut_10_0= rulePointcut ) ) )* otherlv_11= '}' (otherlv_12= 'advice' otherlv_13= '{' ( (lv_advice_14_0= ruleAdvice ) ) (otherlv_15= ',' ( (lv_advice_16_0= ruleAdvice ) ) )* otherlv_17= '}' )? (otherlv_18= 'intertype' otherlv_19= '{' ( (lv_intertype_20_0= ruleIntertypeDeclaration ) ) (otherlv_21= ',' ( (lv_intertype_22_0= ruleIntertypeDeclaration ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:980:1: (otherlv_0= 'Crosscutting' otherlv_1= '{' (otherlv_2= 'source' ( ( ruleEString ) ) )? (otherlv_4= 'target' ( ( ruleEString ) ) )? otherlv_6= 'pointcut' otherlv_7= '{' ( (lv_pointcut_8_0= rulePointcut ) ) (otherlv_9= ',' ( (lv_pointcut_10_0= rulePointcut ) ) )* otherlv_11= '}' (otherlv_12= 'advice' otherlv_13= '{' ( (lv_advice_14_0= ruleAdvice ) ) (otherlv_15= ',' ( (lv_advice_16_0= ruleAdvice ) ) )* otherlv_17= '}' )? (otherlv_18= 'intertype' otherlv_19= '{' ( (lv_intertype_20_0= ruleIntertypeDeclaration ) ) (otherlv_21= ',' ( (lv_intertype_22_0= ruleIntertypeDeclaration ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:980:1: (otherlv_0= 'Crosscutting' otherlv_1= '{' (otherlv_2= 'source' ( ( ruleEString ) ) )? (otherlv_4= 'target' ( ( ruleEString ) ) )? otherlv_6= 'pointcut' otherlv_7= '{' ( (lv_pointcut_8_0= rulePointcut ) ) (otherlv_9= ',' ( (lv_pointcut_10_0= rulePointcut ) ) )* otherlv_11= '}' (otherlv_12= 'advice' otherlv_13= '{' ( (lv_advice_14_0= ruleAdvice ) ) (otherlv_15= ',' ( (lv_advice_16_0= ruleAdvice ) ) )* otherlv_17= '}' )? (otherlv_18= 'intertype' otherlv_19= '{' ( (lv_intertype_20_0= ruleIntertypeDeclaration ) ) (otherlv_21= ',' ( (lv_intertype_22_0= ruleIntertypeDeclaration ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:980:3: otherlv_0= 'Crosscutting' otherlv_1= '{' (otherlv_2= 'source' ( ( ruleEString ) ) )? (otherlv_4= 'target' ( ( ruleEString ) ) )? otherlv_6= 'pointcut' otherlv_7= '{' ( (lv_pointcut_8_0= rulePointcut ) ) (otherlv_9= ',' ( (lv_pointcut_10_0= rulePointcut ) ) )* otherlv_11= '}' (otherlv_12= 'advice' otherlv_13= '{' ( (lv_advice_14_0= ruleAdvice ) ) (otherlv_15= ',' ( (lv_advice_16_0= ruleAdvice ) ) )* otherlv_17= '}' )? (otherlv_18= 'intertype' otherlv_19= '{' ( (lv_intertype_20_0= ruleIntertypeDeclaration ) ) (otherlv_21= ',' ( (lv_intertype_22_0= ruleIntertypeDeclaration ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCrosscutting2189); 

                	newLeafNode(otherlv_0, grammarAccess.getCrosscuttingAccess().getCrosscuttingKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCrosscutting2201); 

                	newLeafNode(otherlv_1, grammarAccess.getCrosscuttingAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:988:1: (otherlv_2= 'source' ( ( ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:988:3: otherlv_2= 'source' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCrosscutting2214); 

                        	newLeafNode(otherlv_2, grammarAccess.getCrosscuttingAccess().getSourceKeyword_2_0());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:992:1: ( ( ruleEString ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:993:1: ( ruleEString )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:993:1: ( ruleEString )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:994:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCrosscuttingRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCrosscuttingAccess().getSourceGoal_ModelCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCrosscutting2237);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1007:4: (otherlv_4= 'target' ( ( ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1007:6: otherlv_4= 'target' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCrosscutting2252); 

                        	newLeafNode(otherlv_4, grammarAccess.getCrosscuttingAccess().getTargetKeyword_3_0());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1011:1: ( ( ruleEString ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1012:1: ( ruleEString )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1012:1: ( ruleEString )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1013:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCrosscuttingRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCrosscuttingAccess().getTargetGoal_ModelCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCrosscutting2275);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCrosscutting2289); 

                	newLeafNode(otherlv_6, grammarAccess.getCrosscuttingAccess().getPointcutKeyword_4());
                
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCrosscutting2301); 

                	newLeafNode(otherlv_7, grammarAccess.getCrosscuttingAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1034:1: ( (lv_pointcut_8_0= rulePointcut ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1035:1: (lv_pointcut_8_0= rulePointcut )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1035:1: (lv_pointcut_8_0= rulePointcut )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1036:3: lv_pointcut_8_0= rulePointcut
            {
             
            	        newCompositeNode(grammarAccess.getCrosscuttingAccess().getPointcutPointcutParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePointcut_in_ruleCrosscutting2322);
            lv_pointcut_8_0=rulePointcut();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCrosscuttingRule());
            	        }
                   		add(
                   			current, 
                   			"pointcut",
                    		lv_pointcut_8_0, 
                    		"Pointcut");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1052:2: (otherlv_9= ',' ( (lv_pointcut_10_0= rulePointcut ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==14) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1052:4: otherlv_9= ',' ( (lv_pointcut_10_0= rulePointcut ) )
            	    {
            	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCrosscutting2335); 

            	        	newLeafNode(otherlv_9, grammarAccess.getCrosscuttingAccess().getCommaKeyword_7_0());
            	        
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1056:1: ( (lv_pointcut_10_0= rulePointcut ) )
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1057:1: (lv_pointcut_10_0= rulePointcut )
            	    {
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1057:1: (lv_pointcut_10_0= rulePointcut )
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1058:3: lv_pointcut_10_0= rulePointcut
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCrosscuttingAccess().getPointcutPointcutParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePointcut_in_ruleCrosscutting2356);
            	    lv_pointcut_10_0=rulePointcut();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCrosscuttingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pointcut",
            	            		lv_pointcut_10_0, 
            	            		"Pointcut");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCrosscutting2370); 

                	newLeafNode(otherlv_11, grammarAccess.getCrosscuttingAccess().getRightCurlyBracketKeyword_8());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1078:1: (otherlv_12= 'advice' otherlv_13= '{' ( (lv_advice_14_0= ruleAdvice ) ) (otherlv_15= ',' ( (lv_advice_16_0= ruleAdvice ) ) )* otherlv_17= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1078:3: otherlv_12= 'advice' otherlv_13= '{' ( (lv_advice_14_0= ruleAdvice ) ) (otherlv_15= ',' ( (lv_advice_16_0= ruleAdvice ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCrosscutting2383); 

                        	newLeafNode(otherlv_12, grammarAccess.getCrosscuttingAccess().getAdviceKeyword_9_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCrosscutting2395); 

                        	newLeafNode(otherlv_13, grammarAccess.getCrosscuttingAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1086:1: ( (lv_advice_14_0= ruleAdvice ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1087:1: (lv_advice_14_0= ruleAdvice )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1087:1: (lv_advice_14_0= ruleAdvice )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1088:3: lv_advice_14_0= ruleAdvice
                    {
                     
                    	        newCompositeNode(grammarAccess.getCrosscuttingAccess().getAdviceAdviceParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAdvice_in_ruleCrosscutting2416);
                    lv_advice_14_0=ruleAdvice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCrosscuttingRule());
                    	        }
                           		add(
                           			current, 
                           			"advice",
                            		lv_advice_14_0, 
                            		"Advice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1104:2: (otherlv_15= ',' ( (lv_advice_16_0= ruleAdvice ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1104:4: otherlv_15= ',' ( (lv_advice_16_0= ruleAdvice ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCrosscutting2429); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getCrosscuttingAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1108:1: ( (lv_advice_16_0= ruleAdvice ) )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1109:1: (lv_advice_16_0= ruleAdvice )
                    	    {
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1109:1: (lv_advice_16_0= ruleAdvice )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1110:3: lv_advice_16_0= ruleAdvice
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCrosscuttingAccess().getAdviceAdviceParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAdvice_in_ruleCrosscutting2450);
                    	    lv_advice_16_0=ruleAdvice();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCrosscuttingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"advice",
                    	            		lv_advice_16_0, 
                    	            		"Advice");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCrosscutting2464); 

                        	newLeafNode(otherlv_17, grammarAccess.getCrosscuttingAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1130:3: (otherlv_18= 'intertype' otherlv_19= '{' ( (lv_intertype_20_0= ruleIntertypeDeclaration ) ) (otherlv_21= ',' ( (lv_intertype_22_0= ruleIntertypeDeclaration ) ) )* otherlv_23= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1130:5: otherlv_18= 'intertype' otherlv_19= '{' ( (lv_intertype_20_0= ruleIntertypeDeclaration ) ) (otherlv_21= ',' ( (lv_intertype_22_0= ruleIntertypeDeclaration ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCrosscutting2479); 

                        	newLeafNode(otherlv_18, grammarAccess.getCrosscuttingAccess().getIntertypeKeyword_10_0());
                        
                    otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCrosscutting2491); 

                        	newLeafNode(otherlv_19, grammarAccess.getCrosscuttingAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1138:1: ( (lv_intertype_20_0= ruleIntertypeDeclaration ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1139:1: (lv_intertype_20_0= ruleIntertypeDeclaration )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1139:1: (lv_intertype_20_0= ruleIntertypeDeclaration )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1140:3: lv_intertype_20_0= ruleIntertypeDeclaration
                    {
                     
                    	        newCompositeNode(grammarAccess.getCrosscuttingAccess().getIntertypeIntertypeDeclarationParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIntertypeDeclaration_in_ruleCrosscutting2512);
                    lv_intertype_20_0=ruleIntertypeDeclaration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCrosscuttingRule());
                    	        }
                           		add(
                           			current, 
                           			"intertype",
                            		lv_intertype_20_0, 
                            		"IntertypeDeclaration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1156:2: (otherlv_21= ',' ( (lv_intertype_22_0= ruleIntertypeDeclaration ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1156:4: otherlv_21= ',' ( (lv_intertype_22_0= ruleIntertypeDeclaration ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCrosscutting2525); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getCrosscuttingAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1160:1: ( (lv_intertype_22_0= ruleIntertypeDeclaration ) )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1161:1: (lv_intertype_22_0= ruleIntertypeDeclaration )
                    	    {
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1161:1: (lv_intertype_22_0= ruleIntertypeDeclaration )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1162:3: lv_intertype_22_0= ruleIntertypeDeclaration
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCrosscuttingAccess().getIntertypeIntertypeDeclarationParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleIntertypeDeclaration_in_ruleCrosscutting2546);
                    	    lv_intertype_22_0=ruleIntertypeDeclaration();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCrosscuttingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"intertype",
                    	            		lv_intertype_22_0, 
                    	            		"IntertypeDeclaration");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCrosscutting2560); 

                        	newLeafNode(otherlv_23, grammarAccess.getCrosscuttingAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_24=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCrosscutting2574); 

                	newLeafNode(otherlv_24, grammarAccess.getCrosscuttingAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleCrosscutting"


    // $ANTLR start "entryRulePointcut"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1194:1: entryRulePointcut returns [EObject current=null] : iv_rulePointcut= rulePointcut EOF ;
    public final EObject entryRulePointcut() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointcut = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1195:2: (iv_rulePointcut= rulePointcut EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1196:2: iv_rulePointcut= rulePointcut EOF
            {
             newCompositeNode(grammarAccess.getPointcutRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePointcut_in_entryRulePointcut2610);
            iv_rulePointcut=rulePointcut();

            state._fsp--;

             current =iv_rulePointcut; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePointcut2620); 

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
    // $ANTLR end "entryRulePointcut"


    // $ANTLR start "rulePointcut"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1203:1: rulePointcut returns [EObject current=null] : (otherlv_0= 'Pointcut' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operand' otherlv_4= '{' ( (lv_operand_5_0= ruleOperand ) ) (otherlv_6= ',' ( (lv_operand_7_0= ruleOperand ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject rulePointcut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operand_5_0 = null;

        EObject lv_operand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1206:28: ( (otherlv_0= 'Pointcut' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operand' otherlv_4= '{' ( (lv_operand_5_0= ruleOperand ) ) (otherlv_6= ',' ( (lv_operand_7_0= ruleOperand ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1207:1: (otherlv_0= 'Pointcut' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operand' otherlv_4= '{' ( (lv_operand_5_0= ruleOperand ) ) (otherlv_6= ',' ( (lv_operand_7_0= ruleOperand ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1207:1: (otherlv_0= 'Pointcut' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operand' otherlv_4= '{' ( (lv_operand_5_0= ruleOperand ) ) (otherlv_6= ',' ( (lv_operand_7_0= ruleOperand ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1207:3: otherlv_0= 'Pointcut' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operand' otherlv_4= '{' ( (lv_operand_5_0= ruleOperand ) ) (otherlv_6= ',' ( (lv_operand_7_0= ruleOperand ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulePointcut2657); 

                	newLeafNode(otherlv_0, grammarAccess.getPointcutAccess().getPointcutKeyword_0());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1211:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1212:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1212:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1213:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPointcutAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePointcut2678);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPointcutRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePointcut2690); 

                	newLeafNode(otherlv_2, grammarAccess.getPointcutAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulePointcut2702); 

                	newLeafNode(otherlv_3, grammarAccess.getPointcutAccess().getOperandKeyword_3());
                
            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePointcut2714); 

                	newLeafNode(otherlv_4, grammarAccess.getPointcutAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1241:1: ( (lv_operand_5_0= ruleOperand ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1242:1: (lv_operand_5_0= ruleOperand )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1242:1: (lv_operand_5_0= ruleOperand )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1243:3: lv_operand_5_0= ruleOperand
            {
             
            	        newCompositeNode(grammarAccess.getPointcutAccess().getOperandOperandParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_rulePointcut2735);
            lv_operand_5_0=ruleOperand();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPointcutRule());
            	        }
                   		add(
                   			current, 
                   			"operand",
                    		lv_operand_5_0, 
                    		"Operand");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1259:2: (otherlv_6= ',' ( (lv_operand_7_0= ruleOperand ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==14) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1259:4: otherlv_6= ',' ( (lv_operand_7_0= ruleOperand ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePointcut2748); 

            	        	newLeafNode(otherlv_6, grammarAccess.getPointcutAccess().getCommaKeyword_6_0());
            	        
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1263:1: ( (lv_operand_7_0= ruleOperand ) )
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1264:1: (lv_operand_7_0= ruleOperand )
            	    {
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1264:1: (lv_operand_7_0= ruleOperand )
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1265:3: lv_operand_7_0= ruleOperand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPointcutAccess().getOperandOperandParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOperand_in_rulePointcut2769);
            	    lv_operand_7_0=ruleOperand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPointcutRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operand",
            	            		lv_operand_7_0, 
            	            		"Operand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePointcut2783); 

                	newLeafNode(otherlv_8, grammarAccess.getPointcutAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePointcut2795); 

                	newLeafNode(otherlv_9, grammarAccess.getPointcutAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "rulePointcut"


    // $ANTLR start "entryRuleAdvice"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1297:1: entryRuleAdvice returns [EObject current=null] : iv_ruleAdvice= ruleAdvice EOF ;
    public final EObject entryRuleAdvice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdvice = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1298:2: (iv_ruleAdvice= ruleAdvice EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1299:2: iv_ruleAdvice= ruleAdvice EOF
            {
             newCompositeNode(grammarAccess.getAdviceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAdvice_in_entryRuleAdvice2831);
            iv_ruleAdvice=ruleAdvice();

            state._fsp--;

             current =iv_ruleAdvice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdvice2841); 

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
    // $ANTLR end "entryRuleAdvice"


    // $ANTLR start "ruleAdvice"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1306:1: ruleAdvice returns [EObject current=null] : (otherlv_0= 'Advice' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAdviceCategory ) ) (otherlv_4= 'joinpointAdvice' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= 'idPointcut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= '}' ) ;
    public final EObject ruleAdvice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1309:28: ( (otherlv_0= 'Advice' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAdviceCategory ) ) (otherlv_4= 'joinpointAdvice' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= 'idPointcut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1310:1: (otherlv_0= 'Advice' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAdviceCategory ) ) (otherlv_4= 'joinpointAdvice' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= 'idPointcut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1310:1: (otherlv_0= 'Advice' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAdviceCategory ) ) (otherlv_4= 'joinpointAdvice' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= 'idPointcut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1310:3: otherlv_0= 'Advice' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleAdviceCategory ) ) (otherlv_4= 'joinpointAdvice' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= 'idPointcut' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAdvice2878); 

                	newLeafNode(otherlv_0, grammarAccess.getAdviceAccess().getAdviceKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAdvice2890); 

                	newLeafNode(otherlv_1, grammarAccess.getAdviceAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAdvice2902); 

                	newLeafNode(otherlv_2, grammarAccess.getAdviceAccess().getTypeKeyword_2());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1322:1: ( (lv_type_3_0= ruleAdviceCategory ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1323:1: (lv_type_3_0= ruleAdviceCategory )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1323:1: (lv_type_3_0= ruleAdviceCategory )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1324:3: lv_type_3_0= ruleAdviceCategory
            {
             
            	        newCompositeNode(grammarAccess.getAdviceAccess().getTypeAdviceCategoryEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAdviceCategory_in_ruleAdvice2923);
            lv_type_3_0=ruleAdviceCategory();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdviceRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"AdviceCategory");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1340:2: (otherlv_4= 'joinpointAdvice' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1340:4: otherlv_4= 'joinpointAdvice' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAdvice2936); 

                        	newLeafNode(otherlv_4, grammarAccess.getAdviceAccess().getJoinpointAdviceKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAdvice2948); 

                        	newLeafNode(otherlv_5, grammarAccess.getAdviceAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1348:1: ( ( ruleEString ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1349:1: ( ruleEString )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1349:1: ( ruleEString )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1350:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAdviceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAdviceAccess().getJoinpointAdviceElementCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAdvice2971);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1363:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==14) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1363:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAdvice2984); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getAdviceAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1367:1: ( ( ruleEString ) )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1368:1: ( ruleEString )
                    	    {
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1368:1: ( ruleEString )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1369:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAdviceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAdviceAccess().getJoinpointAdviceElementCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAdvice3007);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAdvice3021); 

                        	newLeafNode(otherlv_9, grammarAccess.getAdviceAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAdvice3035); 

                	newLeafNode(otherlv_10, grammarAccess.getAdviceAccess().getIdPointcutKeyword_5());
                
            otherlv_11=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAdvice3047); 

                	newLeafNode(otherlv_11, grammarAccess.getAdviceAccess().getLeftParenthesisKeyword_6());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1394:1: ( ( ruleEString ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1395:1: ( ruleEString )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1395:1: ( ruleEString )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1396:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAdviceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAdviceAccess().getIdPointcutPointcutCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAdvice3070);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1409:2: (otherlv_13= ',' ( ( ruleEString ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==14) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1409:4: otherlv_13= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAdvice3083); 

            	        	newLeafNode(otherlv_13, grammarAccess.getAdviceAccess().getCommaKeyword_8_0());
            	        
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1413:1: ( ( ruleEString ) )
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1414:1: ( ruleEString )
            	    {
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1414:1: ( ruleEString )
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1415:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAdviceRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getAdviceAccess().getIdPointcutPointcutCrossReference_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAdvice3106);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_15=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAdvice3120); 

                	newLeafNode(otherlv_15, grammarAccess.getAdviceAccess().getRightParenthesisKeyword_9());
                
            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAdvice3132); 

                	newLeafNode(otherlv_16, grammarAccess.getAdviceAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleAdvice"


    // $ANTLR start "entryRuleIntertypeDeclaration"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1444:1: entryRuleIntertypeDeclaration returns [EObject current=null] : iv_ruleIntertypeDeclaration= ruleIntertypeDeclaration EOF ;
    public final EObject entryRuleIntertypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntertypeDeclaration = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1445:2: (iv_ruleIntertypeDeclaration= ruleIntertypeDeclaration EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1446:2: iv_ruleIntertypeDeclaration= ruleIntertypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getIntertypeDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntertypeDeclaration_in_entryRuleIntertypeDeclaration3168);
            iv_ruleIntertypeDeclaration=ruleIntertypeDeclaration();

            state._fsp--;

             current =iv_ruleIntertypeDeclaration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntertypeDeclaration3178); 

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
    // $ANTLR end "entryRuleIntertypeDeclaration"


    // $ANTLR start "ruleIntertypeDeclaration"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1453:1: ruleIntertypeDeclaration returns [EObject current=null] : (otherlv_0= 'IntertypeDeclaration' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleIntertypeCategory ) ) otherlv_4= 'idPointcut' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' (otherlv_10= 'newElement' otherlv_11= '{' ( (lv_newElement_12_0= ruleElement ) ) (otherlv_13= ',' ( (lv_newElement_14_0= ruleElement ) ) )* otherlv_15= '}' )? (otherlv_16= 'newAttribute' otherlv_17= '{' ( (lv_newAttribute_18_0= ruleAttribute ) ) (otherlv_19= ',' ( (lv_newAttribute_20_0= ruleAttribute ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleIntertypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_newElement_12_0 = null;

        EObject lv_newElement_14_0 = null;

        EObject lv_newAttribute_18_0 = null;

        EObject lv_newAttribute_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1456:28: ( (otherlv_0= 'IntertypeDeclaration' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleIntertypeCategory ) ) otherlv_4= 'idPointcut' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' (otherlv_10= 'newElement' otherlv_11= '{' ( (lv_newElement_12_0= ruleElement ) ) (otherlv_13= ',' ( (lv_newElement_14_0= ruleElement ) ) )* otherlv_15= '}' )? (otherlv_16= 'newAttribute' otherlv_17= '{' ( (lv_newAttribute_18_0= ruleAttribute ) ) (otherlv_19= ',' ( (lv_newAttribute_20_0= ruleAttribute ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1457:1: (otherlv_0= 'IntertypeDeclaration' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleIntertypeCategory ) ) otherlv_4= 'idPointcut' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' (otherlv_10= 'newElement' otherlv_11= '{' ( (lv_newElement_12_0= ruleElement ) ) (otherlv_13= ',' ( (lv_newElement_14_0= ruleElement ) ) )* otherlv_15= '}' )? (otherlv_16= 'newAttribute' otherlv_17= '{' ( (lv_newAttribute_18_0= ruleAttribute ) ) (otherlv_19= ',' ( (lv_newAttribute_20_0= ruleAttribute ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1457:1: (otherlv_0= 'IntertypeDeclaration' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleIntertypeCategory ) ) otherlv_4= 'idPointcut' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' (otherlv_10= 'newElement' otherlv_11= '{' ( (lv_newElement_12_0= ruleElement ) ) (otherlv_13= ',' ( (lv_newElement_14_0= ruleElement ) ) )* otherlv_15= '}' )? (otherlv_16= 'newAttribute' otherlv_17= '{' ( (lv_newAttribute_18_0= ruleAttribute ) ) (otherlv_19= ',' ( (lv_newAttribute_20_0= ruleAttribute ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1457:3: otherlv_0= 'IntertypeDeclaration' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleIntertypeCategory ) ) otherlv_4= 'idPointcut' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' (otherlv_10= 'newElement' otherlv_11= '{' ( (lv_newElement_12_0= ruleElement ) ) (otherlv_13= ',' ( (lv_newElement_14_0= ruleElement ) ) )* otherlv_15= '}' )? (otherlv_16= 'newAttribute' otherlv_17= '{' ( (lv_newAttribute_18_0= ruleAttribute ) ) (otherlv_19= ',' ( (lv_newAttribute_20_0= ruleAttribute ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleIntertypeDeclaration3215); 

                	newLeafNode(otherlv_0, grammarAccess.getIntertypeDeclarationAccess().getIntertypeDeclarationKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIntertypeDeclaration3227); 

                	newLeafNode(otherlv_1, grammarAccess.getIntertypeDeclarationAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleIntertypeDeclaration3239); 

                	newLeafNode(otherlv_2, grammarAccess.getIntertypeDeclarationAccess().getTypeKeyword_2());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1469:1: ( (lv_type_3_0= ruleIntertypeCategory ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1470:1: (lv_type_3_0= ruleIntertypeCategory )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1470:1: (lv_type_3_0= ruleIntertypeCategory )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1471:3: lv_type_3_0= ruleIntertypeCategory
            {
             
            	        newCompositeNode(grammarAccess.getIntertypeDeclarationAccess().getTypeIntertypeCategoryEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleIntertypeCategory_in_ruleIntertypeDeclaration3260);
            lv_type_3_0=ruleIntertypeCategory();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntertypeDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"IntertypeCategory");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleIntertypeDeclaration3272); 

                	newLeafNode(otherlv_4, grammarAccess.getIntertypeDeclarationAccess().getIdPointcutKeyword_4());
                
            otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleIntertypeDeclaration3284); 

                	newLeafNode(otherlv_5, grammarAccess.getIntertypeDeclarationAccess().getLeftParenthesisKeyword_5());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1495:1: ( ( ruleEString ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1496:1: ( ruleEString )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1496:1: ( ruleEString )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1497:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIntertypeDeclarationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIntertypeDeclarationAccess().getIdPointcutPointcutCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntertypeDeclaration3307);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1510:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==14) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1510:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleIntertypeDeclaration3320); 

            	        	newLeafNode(otherlv_7, grammarAccess.getIntertypeDeclarationAccess().getCommaKeyword_7_0());
            	        
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1514:1: ( ( ruleEString ) )
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1515:1: ( ruleEString )
            	    {
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1515:1: ( ruleEString )
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1516:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIntertypeDeclarationRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getIntertypeDeclarationAccess().getIdPointcutPointcutCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntertypeDeclaration3343);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_9=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleIntertypeDeclaration3357); 

                	newLeafNode(otherlv_9, grammarAccess.getIntertypeDeclarationAccess().getRightParenthesisKeyword_8());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1533:1: (otherlv_10= 'newElement' otherlv_11= '{' ( (lv_newElement_12_0= ruleElement ) ) (otherlv_13= ',' ( (lv_newElement_14_0= ruleElement ) ) )* otherlv_15= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1533:3: otherlv_10= 'newElement' otherlv_11= '{' ( (lv_newElement_12_0= ruleElement ) ) (otherlv_13= ',' ( (lv_newElement_14_0= ruleElement ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleIntertypeDeclaration3370); 

                        	newLeafNode(otherlv_10, grammarAccess.getIntertypeDeclarationAccess().getNewElementKeyword_9_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIntertypeDeclaration3382); 

                        	newLeafNode(otherlv_11, grammarAccess.getIntertypeDeclarationAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1541:1: ( (lv_newElement_12_0= ruleElement ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1542:1: (lv_newElement_12_0= ruleElement )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1542:1: (lv_newElement_12_0= ruleElement )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1543:3: lv_newElement_12_0= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntertypeDeclarationAccess().getNewElementElementParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleIntertypeDeclaration3403);
                    lv_newElement_12_0=ruleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntertypeDeclarationRule());
                    	        }
                           		add(
                           			current, 
                           			"newElement",
                            		lv_newElement_12_0, 
                            		"Element");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1559:2: (otherlv_13= ',' ( (lv_newElement_14_0= ruleElement ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1559:4: otherlv_13= ',' ( (lv_newElement_14_0= ruleElement ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleIntertypeDeclaration3416); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getIntertypeDeclarationAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1563:1: ( (lv_newElement_14_0= ruleElement ) )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1564:1: (lv_newElement_14_0= ruleElement )
                    	    {
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1564:1: (lv_newElement_14_0= ruleElement )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1565:3: lv_newElement_14_0= ruleElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIntertypeDeclarationAccess().getNewElementElementParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleIntertypeDeclaration3437);
                    	    lv_newElement_14_0=ruleElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIntertypeDeclarationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"newElement",
                    	            		lv_newElement_14_0, 
                    	            		"Element");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntertypeDeclaration3451); 

                        	newLeafNode(otherlv_15, grammarAccess.getIntertypeDeclarationAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1585:3: (otherlv_16= 'newAttribute' otherlv_17= '{' ( (lv_newAttribute_18_0= ruleAttribute ) ) (otherlv_19= ',' ( (lv_newAttribute_20_0= ruleAttribute ) ) )* otherlv_21= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==40) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1585:5: otherlv_16= 'newAttribute' otherlv_17= '{' ( (lv_newAttribute_18_0= ruleAttribute ) ) (otherlv_19= ',' ( (lv_newAttribute_20_0= ruleAttribute ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleIntertypeDeclaration3466); 

                        	newLeafNode(otherlv_16, grammarAccess.getIntertypeDeclarationAccess().getNewAttributeKeyword_10_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIntertypeDeclaration3478); 

                        	newLeafNode(otherlv_17, grammarAccess.getIntertypeDeclarationAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1593:1: ( (lv_newAttribute_18_0= ruleAttribute ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1594:1: (lv_newAttribute_18_0= ruleAttribute )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1594:1: (lv_newAttribute_18_0= ruleAttribute )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1595:3: lv_newAttribute_18_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntertypeDeclarationAccess().getNewAttributeAttributeParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleIntertypeDeclaration3499);
                    lv_newAttribute_18_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntertypeDeclarationRule());
                    	        }
                           		add(
                           			current, 
                           			"newAttribute",
                            		lv_newAttribute_18_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1611:2: (otherlv_19= ',' ( (lv_newAttribute_20_0= ruleAttribute ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==14) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1611:4: otherlv_19= ',' ( (lv_newAttribute_20_0= ruleAttribute ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleIntertypeDeclaration3512); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getIntertypeDeclarationAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1615:1: ( (lv_newAttribute_20_0= ruleAttribute ) )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1616:1: (lv_newAttribute_20_0= ruleAttribute )
                    	    {
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1616:1: (lv_newAttribute_20_0= ruleAttribute )
                    	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1617:3: lv_newAttribute_20_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIntertypeDeclarationAccess().getNewAttributeAttributeParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleIntertypeDeclaration3533);
                    	    lv_newAttribute_20_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIntertypeDeclarationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"newAttribute",
                    	            		lv_newAttribute_20_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntertypeDeclaration3547); 

                        	newLeafNode(otherlv_21, grammarAccess.getIntertypeDeclarationAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIntertypeDeclaration3561); 

                	newLeafNode(otherlv_22, grammarAccess.getIntertypeDeclarationAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleIntertypeDeclaration"


    // $ANTLR start "entryRuleOperand"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1649:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1650:2: (iv_ruleOperand= ruleOperand EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1651:2: iv_ruleOperand= ruleOperand EOF
            {
             newCompositeNode(grammarAccess.getOperandRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperand_in_entryRuleOperand3597);
            iv_ruleOperand=ruleOperand();

            state._fsp--;

             current =iv_ruleOperand; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperand3607); 

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
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1658:1: ruleOperand returns [EObject current=null] : (otherlv_0= 'Operand' otherlv_1= '{' otherlv_2= 'primitive' ( (lv_primitive_3_0= rulePrimitiveTypes ) ) otherlv_4= 'joinpointPointcut' ( ( ruleEString ) ) (otherlv_6= 'operator' ( (lv_operator_7_0= ruleOperator ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_primitive_3_0 = null;

        EObject lv_operator_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1661:28: ( (otherlv_0= 'Operand' otherlv_1= '{' otherlv_2= 'primitive' ( (lv_primitive_3_0= rulePrimitiveTypes ) ) otherlv_4= 'joinpointPointcut' ( ( ruleEString ) ) (otherlv_6= 'operator' ( (lv_operator_7_0= ruleOperator ) ) )? otherlv_8= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1662:1: (otherlv_0= 'Operand' otherlv_1= '{' otherlv_2= 'primitive' ( (lv_primitive_3_0= rulePrimitiveTypes ) ) otherlv_4= 'joinpointPointcut' ( ( ruleEString ) ) (otherlv_6= 'operator' ( (lv_operator_7_0= ruleOperator ) ) )? otherlv_8= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1662:1: (otherlv_0= 'Operand' otherlv_1= '{' otherlv_2= 'primitive' ( (lv_primitive_3_0= rulePrimitiveTypes ) ) otherlv_4= 'joinpointPointcut' ( ( ruleEString ) ) (otherlv_6= 'operator' ( (lv_operator_7_0= ruleOperator ) ) )? otherlv_8= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1662:3: otherlv_0= 'Operand' otherlv_1= '{' otherlv_2= 'primitive' ( (lv_primitive_3_0= rulePrimitiveTypes ) ) otherlv_4= 'joinpointPointcut' ( ( ruleEString ) ) (otherlv_6= 'operator' ( (lv_operator_7_0= ruleOperator ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleOperand3644); 

                	newLeafNode(otherlv_0, grammarAccess.getOperandAccess().getOperandKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOperand3656); 

                	newLeafNode(otherlv_1, grammarAccess.getOperandAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleOperand3668); 

                	newLeafNode(otherlv_2, grammarAccess.getOperandAccess().getPrimitiveKeyword_2());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1674:1: ( (lv_primitive_3_0= rulePrimitiveTypes ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1675:1: (lv_primitive_3_0= rulePrimitiveTypes )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1675:1: (lv_primitive_3_0= rulePrimitiveTypes )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1676:3: lv_primitive_3_0= rulePrimitiveTypes
            {
             
            	        newCompositeNode(grammarAccess.getOperandAccess().getPrimitivePrimitiveTypesEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveTypes_in_ruleOperand3689);
            lv_primitive_3_0=rulePrimitiveTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperandRule());
            	        }
                   		set(
                   			current, 
                   			"primitive",
                    		lv_primitive_3_0, 
                    		"PrimitiveTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleOperand3701); 

                	newLeafNode(otherlv_4, grammarAccess.getOperandAccess().getJoinpointPointcutKeyword_4());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1696:1: ( ( ruleEString ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1697:1: ( ruleEString )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1697:1: ( ruleEString )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1698:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOperandRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOperandAccess().getJoinpointPointcutElementCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOperand3724);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1711:2: (otherlv_6= 'operator' ( (lv_operator_7_0= ruleOperator ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1711:4: otherlv_6= 'operator' ( (lv_operator_7_0= ruleOperator ) )
                    {
                    otherlv_6=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleOperand3737); 

                        	newLeafNode(otherlv_6, grammarAccess.getOperandAccess().getOperatorKeyword_6_0());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1715:1: ( (lv_operator_7_0= ruleOperator ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1716:1: (lv_operator_7_0= ruleOperator )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1716:1: (lv_operator_7_0= ruleOperator )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1717:3: lv_operator_7_0= ruleOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperandAccess().getOperatorOperatorParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleOperand3758);
                    lv_operator_7_0=ruleOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperandRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_7_0, 
                            		"Operator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOperand3772); 

                	newLeafNode(otherlv_8, grammarAccess.getOperandAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleOperator"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1745:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1746:2: (iv_ruleOperator= ruleOperator EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1747:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperator_in_entryRuleOperator3808);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperator3818); 

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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1754:1: ruleOperator returns [EObject current=null] : (otherlv_0= 'Operator' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleOperatorTypes ) ) otherlv_4= '}' ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_operator_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1757:28: ( (otherlv_0= 'Operator' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleOperatorTypes ) ) otherlv_4= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1758:1: (otherlv_0= 'Operator' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleOperatorTypes ) ) otherlv_4= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1758:1: (otherlv_0= 'Operator' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleOperatorTypes ) ) otherlv_4= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1758:3: otherlv_0= 'Operator' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleOperatorTypes ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleOperator3855); 

                	newLeafNode(otherlv_0, grammarAccess.getOperatorAccess().getOperatorKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOperator3867); 

                	newLeafNode(otherlv_1, grammarAccess.getOperatorAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleOperator3879); 

                	newLeafNode(otherlv_2, grammarAccess.getOperatorAccess().getOperatorKeyword_2());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1770:1: ( (lv_operator_3_0= ruleOperatorTypes ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1771:1: (lv_operator_3_0= ruleOperatorTypes )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1771:1: (lv_operator_3_0= ruleOperatorTypes )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1772:3: lv_operator_3_0= ruleOperatorTypes
            {
             
            	        newCompositeNode(grammarAccess.getOperatorAccess().getOperatorOperatorTypesEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperatorTypes_in_ruleOperator3900);
            lv_operator_3_0=ruleOperatorTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperatorRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_3_0, 
                    		"OperatorTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOperator3912); 

                	newLeafNode(otherlv_4, grammarAccess.getOperatorAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1800:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1801:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1802:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute3948);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute3958); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1809:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1812:28: ( (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1813:1: (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1813:1: (otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1813:3: otherlv_0= 'Attribute' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAttribute3995); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAttribute4007); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAttribute4019); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getTypeKeyword_2());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1825:1: ( (lv_type_3_0= ruleEString ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1826:1: (lv_type_3_0= ruleEString )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1826:1: (lv_type_3_0= ruleEString )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1827:3: lv_type_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttribute4040);
            lv_type_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAttribute4052); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getValueKeyword_4());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1847:1: ( (lv_value_5_0= ruleEString ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1848:1: (lv_value_5_0= ruleEString )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1848:1: (lv_value_5_0= ruleEString )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1849:3: lv_value_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getValueEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttribute4073);
            lv_value_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAttribute4085); 

                	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleIsFeature"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1877:1: entryRuleIsFeature returns [EObject current=null] : iv_ruleIsFeature= ruleIsFeature EOF ;
    public final EObject entryRuleIsFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsFeature = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1878:2: (iv_ruleIsFeature= ruleIsFeature EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1879:2: iv_ruleIsFeature= ruleIsFeature EOF
            {
             newCompositeNode(grammarAccess.getIsFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIsFeature_in_entryRuleIsFeature4121);
            iv_ruleIsFeature=ruleIsFeature();

            state._fsp--;

             current =iv_ruleIsFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIsFeature4131); 

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
    // $ANTLR end "entryRuleIsFeature"


    // $ANTLR start "ruleIsFeature"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1886:1: ruleIsFeature returns [EObject current=null] : (otherlv_0= 'IsFeature' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= ruleIsFeatureTypes ) ) otherlv_4= '}' ) ;
    public final EObject ruleIsFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_label_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1889:28: ( (otherlv_0= 'IsFeature' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= ruleIsFeatureTypes ) ) otherlv_4= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1890:1: (otherlv_0= 'IsFeature' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= ruleIsFeatureTypes ) ) otherlv_4= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1890:1: (otherlv_0= 'IsFeature' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= ruleIsFeatureTypes ) ) otherlv_4= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1890:3: otherlv_0= 'IsFeature' otherlv_1= '{' otherlv_2= 'label' ( (lv_label_3_0= ruleIsFeatureTypes ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleIsFeature4168); 

                	newLeafNode(otherlv_0, grammarAccess.getIsFeatureAccess().getIsFeatureKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIsFeature4180); 

                	newLeafNode(otherlv_1, grammarAccess.getIsFeatureAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleIsFeature4192); 

                	newLeafNode(otherlv_2, grammarAccess.getIsFeatureAccess().getLabelKeyword_2());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1902:1: ( (lv_label_3_0= ruleIsFeatureTypes ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1903:1: (lv_label_3_0= ruleIsFeatureTypes )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1903:1: (lv_label_3_0= ruleIsFeatureTypes )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1904:3: lv_label_3_0= ruleIsFeatureTypes
            {
             
            	        newCompositeNode(grammarAccess.getIsFeatureAccess().getLabelIsFeatureTypesEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleIsFeatureTypes_in_ruleIsFeature4213);
            lv_label_3_0=ruleIsFeatureTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIsFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"label",
                    		lv_label_3_0, 
                    		"IsFeatureTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIsFeature4225); 

                	newLeafNode(otherlv_4, grammarAccess.getIsFeatureAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleIsFeature"


    // $ANTLR start "entryRuleCardinality"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1932:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1933:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1934:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCardinality_in_entryRuleCardinality4261);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCardinality4271); 

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1941:1: ruleCardinality returns [EObject current=null] : (otherlv_0= 'Cardinality' otherlv_1= '{' otherlv_2= 'cardinalityMin' ( (lv_cardinalityMin_3_0= ruleEString ) ) otherlv_4= 'cardinalityMax' ( (lv_cardinalityMax_5_0= ruleEString ) ) (otherlv_6= 'source' ( ( ruleEString ) ) )? (otherlv_8= 'target' ( ( ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_cardinalityMin_3_0 = null;

        AntlrDatatypeRuleToken lv_cardinalityMax_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1944:28: ( (otherlv_0= 'Cardinality' otherlv_1= '{' otherlv_2= 'cardinalityMin' ( (lv_cardinalityMin_3_0= ruleEString ) ) otherlv_4= 'cardinalityMax' ( (lv_cardinalityMax_5_0= ruleEString ) ) (otherlv_6= 'source' ( ( ruleEString ) ) )? (otherlv_8= 'target' ( ( ruleEString ) ) )? otherlv_10= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1945:1: (otherlv_0= 'Cardinality' otherlv_1= '{' otherlv_2= 'cardinalityMin' ( (lv_cardinalityMin_3_0= ruleEString ) ) otherlv_4= 'cardinalityMax' ( (lv_cardinalityMax_5_0= ruleEString ) ) (otherlv_6= 'source' ( ( ruleEString ) ) )? (otherlv_8= 'target' ( ( ruleEString ) ) )? otherlv_10= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1945:1: (otherlv_0= 'Cardinality' otherlv_1= '{' otherlv_2= 'cardinalityMin' ( (lv_cardinalityMin_3_0= ruleEString ) ) otherlv_4= 'cardinalityMax' ( (lv_cardinalityMax_5_0= ruleEString ) ) (otherlv_6= 'source' ( ( ruleEString ) ) )? (otherlv_8= 'target' ( ( ruleEString ) ) )? otherlv_10= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1945:3: otherlv_0= 'Cardinality' otherlv_1= '{' otherlv_2= 'cardinalityMin' ( (lv_cardinalityMin_3_0= ruleEString ) ) otherlv_4= 'cardinalityMax' ( (lv_cardinalityMax_5_0= ruleEString ) ) (otherlv_6= 'source' ( ( ruleEString ) ) )? (otherlv_8= 'target' ( ( ruleEString ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleCardinality4308); 

                	newLeafNode(otherlv_0, grammarAccess.getCardinalityAccess().getCardinalityKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCardinality4320); 

                	newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleCardinality4332); 

                	newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getCardinalityMinKeyword_2());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1957:1: ( (lv_cardinalityMin_3_0= ruleEString ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1958:1: (lv_cardinalityMin_3_0= ruleEString )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1958:1: (lv_cardinalityMin_3_0= ruleEString )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1959:3: lv_cardinalityMin_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCardinalityAccess().getCardinalityMinEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCardinality4353);
            lv_cardinalityMin_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCardinalityRule());
            	        }
                   		set(
                   			current, 
                   			"cardinalityMin",
                    		lv_cardinalityMin_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleCardinality4365); 

                	newLeafNode(otherlv_4, grammarAccess.getCardinalityAccess().getCardinalityMaxKeyword_4());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1979:1: ( (lv_cardinalityMax_5_0= ruleEString ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1980:1: (lv_cardinalityMax_5_0= ruleEString )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1980:1: (lv_cardinalityMax_5_0= ruleEString )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1981:3: lv_cardinalityMax_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCardinalityAccess().getCardinalityMaxEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCardinality4386);
            lv_cardinalityMax_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCardinalityRule());
            	        }
                   		set(
                   			current, 
                   			"cardinalityMax",
                    		lv_cardinalityMax_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1997:2: (otherlv_6= 'source' ( ( ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==24) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:1997:4: otherlv_6= 'source' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCardinality4399); 

                        	newLeafNode(otherlv_6, grammarAccess.getCardinalityAccess().getSourceKeyword_6_0());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2001:1: ( ( ruleEString ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2002:1: ( ruleEString )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2002:1: ( ruleEString )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2003:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCardinalityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCardinalityAccess().getSourceElementCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCardinality4422);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2016:4: (otherlv_8= 'target' ( ( ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==25) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2016:6: otherlv_8= 'target' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCardinality4437); 

                        	newLeafNode(otherlv_8, grammarAccess.getCardinalityAccess().getTargetKeyword_7_0());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2020:1: ( ( ruleEString ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2021:1: ( ruleEString )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2021:1: ( ruleEString )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2022:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCardinalityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCardinalityAccess().getTargetGoal_ModelCrossReference_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCardinality4460);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCardinality4474); 

                	newLeafNode(otherlv_10, grammarAccess.getCardinalityAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleGroupFeature"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2047:1: entryRuleGroupFeature returns [EObject current=null] : iv_ruleGroupFeature= ruleGroupFeature EOF ;
    public final EObject entryRuleGroupFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupFeature = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2048:2: (iv_ruleGroupFeature= ruleGroupFeature EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2049:2: iv_ruleGroupFeature= ruleGroupFeature EOF
            {
             newCompositeNode(grammarAccess.getGroupFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupFeature_in_entryRuleGroupFeature4510);
            iv_ruleGroupFeature=ruleGroupFeature();

            state._fsp--;

             current =iv_ruleGroupFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroupFeature4520); 

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
    // $ANTLR end "entryRuleGroupFeature"


    // $ANTLR start "ruleGroupFeature"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2056:1: ruleGroupFeature returns [EObject current=null] : (otherlv_0= 'GroupFeature' otherlv_1= '{' otherlv_2= 'cardinalityGroupMin' ( (lv_cardinalityGroupMin_3_0= ruleEString ) ) otherlv_4= 'cardinalityGroupMax' ( (lv_cardinalityGroupMax_5_0= ruleEString ) ) otherlv_6= 'source' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= 'target' ( ( ruleEString ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleGroupFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_cardinalityGroupMin_3_0 = null;

        AntlrDatatypeRuleToken lv_cardinalityGroupMax_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2059:28: ( (otherlv_0= 'GroupFeature' otherlv_1= '{' otherlv_2= 'cardinalityGroupMin' ( (lv_cardinalityGroupMin_3_0= ruleEString ) ) otherlv_4= 'cardinalityGroupMax' ( (lv_cardinalityGroupMax_5_0= ruleEString ) ) otherlv_6= 'source' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= 'target' ( ( ruleEString ) ) )? otherlv_14= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2060:1: (otherlv_0= 'GroupFeature' otherlv_1= '{' otherlv_2= 'cardinalityGroupMin' ( (lv_cardinalityGroupMin_3_0= ruleEString ) ) otherlv_4= 'cardinalityGroupMax' ( (lv_cardinalityGroupMax_5_0= ruleEString ) ) otherlv_6= 'source' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= 'target' ( ( ruleEString ) ) )? otherlv_14= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2060:1: (otherlv_0= 'GroupFeature' otherlv_1= '{' otherlv_2= 'cardinalityGroupMin' ( (lv_cardinalityGroupMin_3_0= ruleEString ) ) otherlv_4= 'cardinalityGroupMax' ( (lv_cardinalityGroupMax_5_0= ruleEString ) ) otherlv_6= 'source' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= 'target' ( ( ruleEString ) ) )? otherlv_14= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2060:3: otherlv_0= 'GroupFeature' otherlv_1= '{' otherlv_2= 'cardinalityGroupMin' ( (lv_cardinalityGroupMin_3_0= ruleEString ) ) otherlv_4= 'cardinalityGroupMax' ( (lv_cardinalityGroupMax_5_0= ruleEString ) ) otherlv_6= 'source' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' (otherlv_12= 'target' ( ( ruleEString ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleGroupFeature4557); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupFeatureAccess().getGroupFeatureKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGroupFeature4569); 

                	newLeafNode(otherlv_1, grammarAccess.getGroupFeatureAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleGroupFeature4581); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupFeatureAccess().getCardinalityGroupMinKeyword_2());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2072:1: ( (lv_cardinalityGroupMin_3_0= ruleEString ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2073:1: (lv_cardinalityGroupMin_3_0= ruleEString )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2073:1: (lv_cardinalityGroupMin_3_0= ruleEString )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2074:3: lv_cardinalityGroupMin_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGroupFeatureAccess().getCardinalityGroupMinEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroupFeature4602);
            lv_cardinalityGroupMin_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"cardinalityGroupMin",
                    		lv_cardinalityGroupMin_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleGroupFeature4614); 

                	newLeafNode(otherlv_4, grammarAccess.getGroupFeatureAccess().getCardinalityGroupMaxKeyword_4());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2094:1: ( (lv_cardinalityGroupMax_5_0= ruleEString ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2095:1: (lv_cardinalityGroupMax_5_0= ruleEString )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2095:1: (lv_cardinalityGroupMax_5_0= ruleEString )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2096:3: lv_cardinalityGroupMax_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGroupFeatureAccess().getCardinalityGroupMaxEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroupFeature4635);
            lv_cardinalityGroupMax_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"cardinalityGroupMax",
                    		lv_cardinalityGroupMax_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGroupFeature4647); 

                	newLeafNode(otherlv_6, grammarAccess.getGroupFeatureAccess().getSourceKeyword_6());
                
            otherlv_7=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleGroupFeature4659); 

                	newLeafNode(otherlv_7, grammarAccess.getGroupFeatureAccess().getLeftParenthesisKeyword_7());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2120:1: ( ( ruleEString ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2121:1: ( ruleEString )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2121:1: ( ruleEString )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2122:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGroupFeatureAccess().getSourceElementCrossReference_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroupFeature4682);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2135:2: (otherlv_9= ',' ( ( ruleEString ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==14) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2135:4: otherlv_9= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroupFeature4695); 

            	        	newLeafNode(otherlv_9, grammarAccess.getGroupFeatureAccess().getCommaKeyword_9_0());
            	        
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2139:1: ( ( ruleEString ) )
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2140:1: ( ruleEString )
            	    {
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2140:1: ( ruleEString )
            	    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2141:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupFeatureRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGroupFeatureAccess().getSourceElementCrossReference_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroupFeature4718);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_11=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleGroupFeature4732); 

                	newLeafNode(otherlv_11, grammarAccess.getGroupFeatureAccess().getRightParenthesisKeyword_10());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2158:1: (otherlv_12= 'target' ( ( ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==25) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2158:3: otherlv_12= 'target' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleGroupFeature4745); 

                        	newLeafNode(otherlv_12, grammarAccess.getGroupFeatureAccess().getTargetKeyword_11_0());
                        
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2162:1: ( ( ruleEString ) )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2163:1: ( ruleEString )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2163:1: ( ruleEString )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2164:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGroupFeatureRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getGroupFeatureAccess().getTargetGoal_ModelCrossReference_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroupFeature4768);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGroupFeature4782); 

                	newLeafNode(otherlv_14, grammarAccess.getGroupFeatureAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleGroupFeature"


    // $ANTLR start "entryRuleGeneric_Property"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2189:1: entryRuleGeneric_Property returns [EObject current=null] : iv_ruleGeneric_Property= ruleGeneric_Property EOF ;
    public final EObject entryRuleGeneric_Property() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneric_Property = null;


        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2190:2: (iv_ruleGeneric_Property= ruleGeneric_Property EOF )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2191:2: iv_ruleGeneric_Property= ruleGeneric_Property EOF
            {
             newCompositeNode(grammarAccess.getGeneric_PropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGeneric_Property_in_entryRuleGeneric_Property4818);
            iv_ruleGeneric_Property=ruleGeneric_Property();

            state._fsp--;

             current =iv_ruleGeneric_Property; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGeneric_Property4828); 

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
    // $ANTLR end "entryRuleGeneric_Property"


    // $ANTLR start "ruleGeneric_Property"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2198:1: ruleGeneric_Property returns [EObject current=null] : (otherlv_0= 'Generic_Property' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleGeneric_Property() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2201:28: ( (otherlv_0= 'Generic_Property' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2202:1: (otherlv_0= 'Generic_Property' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2202:1: (otherlv_0= 'Generic_Property' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}' )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2202:3: otherlv_0= 'Generic_Property' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleGeneric_Property4865); 

                	newLeafNode(otherlv_0, grammarAccess.getGeneric_PropertyAccess().getGeneric_PropertyKeyword_0());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2206:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2207:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2207:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2208:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGeneric_PropertyAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGeneric_Property4886);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGeneric_PropertyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGeneric_Property4898); 

                	newLeafNode(otherlv_2, grammarAccess.getGeneric_PropertyAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleGeneric_Property4910); 

                	newLeafNode(otherlv_3, grammarAccess.getGeneric_PropertyAccess().getValueKeyword_3());
                
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2232:1: ( (lv_value_4_0= ruleEString ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2233:1: (lv_value_4_0= ruleEString )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2233:1: (lv_value_4_0= ruleEString )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2234:3: lv_value_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGeneric_PropertyAccess().getValueEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGeneric_Property4931);
            lv_value_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGeneric_PropertyRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGeneric_Property4943); 

                	newLeafNode(otherlv_5, grammarAccess.getGeneric_PropertyAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleGeneric_Property"


    // $ANTLR start "ruleElementTypes"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2262:1: ruleElementTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'task' ) | (enumLiteral_1= 'goal' ) | (enumLiteral_2= 'softgoal' ) | (enumLiteral_3= 'task_ref' ) | (enumLiteral_4= 'goal_ref' ) | (enumLiteral_5= 'softgoal_ref' ) ) ;
    public final Enumerator ruleElementTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2264:28: ( ( (enumLiteral_0= 'task' ) | (enumLiteral_1= 'goal' ) | (enumLiteral_2= 'softgoal' ) | (enumLiteral_3= 'task_ref' ) | (enumLiteral_4= 'goal_ref' ) | (enumLiteral_5= 'softgoal_ref' ) ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2265:1: ( (enumLiteral_0= 'task' ) | (enumLiteral_1= 'goal' ) | (enumLiteral_2= 'softgoal' ) | (enumLiteral_3= 'task_ref' ) | (enumLiteral_4= 'goal_ref' ) | (enumLiteral_5= 'softgoal_ref' ) )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2265:1: ( (enumLiteral_0= 'task' ) | (enumLiteral_1= 'goal' ) | (enumLiteral_2= 'softgoal' ) | (enumLiteral_3= 'task_ref' ) | (enumLiteral_4= 'goal_ref' ) | (enumLiteral_5= 'softgoal_ref' ) )
            int alt43=6;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt43=1;
                }
                break;
            case 57:
                {
                alt43=2;
                }
                break;
            case 58:
                {
                alt43=3;
                }
                break;
            case 59:
                {
                alt43=4;
                }
                break;
            case 60:
                {
                alt43=5;
                }
                break;
            case 61:
                {
                alt43=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2265:2: (enumLiteral_0= 'task' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2265:2: (enumLiteral_0= 'task' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2265:4: enumLiteral_0= 'task'
                    {
                    enumLiteral_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleElementTypes4993); 

                            current = grammarAccess.getElementTypesAccess().getTaskEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getElementTypesAccess().getTaskEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2271:6: (enumLiteral_1= 'goal' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2271:6: (enumLiteral_1= 'goal' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2271:8: enumLiteral_1= 'goal'
                    {
                    enumLiteral_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleElementTypes5010); 

                            current = grammarAccess.getElementTypesAccess().getGoalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getElementTypesAccess().getGoalEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2277:6: (enumLiteral_2= 'softgoal' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2277:6: (enumLiteral_2= 'softgoal' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2277:8: enumLiteral_2= 'softgoal'
                    {
                    enumLiteral_2=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleElementTypes5027); 

                            current = grammarAccess.getElementTypesAccess().getSoftgoalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getElementTypesAccess().getSoftgoalEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2283:6: (enumLiteral_3= 'task_ref' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2283:6: (enumLiteral_3= 'task_ref' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2283:8: enumLiteral_3= 'task_ref'
                    {
                    enumLiteral_3=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleElementTypes5044); 

                            current = grammarAccess.getElementTypesAccess().getTask_refEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getElementTypesAccess().getTask_refEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2289:6: (enumLiteral_4= 'goal_ref' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2289:6: (enumLiteral_4= 'goal_ref' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2289:8: enumLiteral_4= 'goal_ref'
                    {
                    enumLiteral_4=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleElementTypes5061); 

                            current = grammarAccess.getElementTypesAccess().getGoal_refEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getElementTypesAccess().getGoal_refEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2295:6: (enumLiteral_5= 'softgoal_ref' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2295:6: (enumLiteral_5= 'softgoal_ref' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2295:8: enumLiteral_5= 'softgoal_ref'
                    {
                    enumLiteral_5=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleElementTypes5078); 

                            current = grammarAccess.getElementTypesAccess().getSoftgoal_refEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getElementTypesAccess().getSoftgoal_refEnumLiteralDeclaration_5()); 
                        

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
    // $ANTLR end "ruleElementTypes"


    // $ANTLR start "ruleDecompositionCategory"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2305:1: ruleDecompositionCategory returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) | (enumLiteral_3= 'inc_or' ) ) ;
    public final Enumerator ruleDecompositionCategory() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2307:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) | (enumLiteral_3= 'inc_or' ) ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2308:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) | (enumLiteral_3= 'inc_or' ) )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2308:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) | (enumLiteral_3= 'inc_or' ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt44=1;
                }
                break;
            case 63:
                {
                alt44=2;
                }
                break;
            case 64:
                {
                alt44=3;
                }
                break;
            case 65:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2308:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2308:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2308:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleDecompositionCategory5123); 

                            current = grammarAccess.getDecompositionCategoryAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDecompositionCategoryAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2314:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2314:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2314:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleDecompositionCategory5140); 

                            current = grammarAccess.getDecompositionCategoryAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDecompositionCategoryAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2320:6: (enumLiteral_2= 'xor' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2320:6: (enumLiteral_2= 'xor' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2320:8: enumLiteral_2= 'xor'
                    {
                    enumLiteral_2=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleDecompositionCategory5157); 

                            current = grammarAccess.getDecompositionCategoryAccess().getXorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDecompositionCategoryAccess().getXorEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2326:6: (enumLiteral_3= 'inc_or' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2326:6: (enumLiteral_3= 'inc_or' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2326:8: enumLiteral_3= 'inc_or'
                    {
                    enumLiteral_3=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleDecompositionCategory5174); 

                            current = grammarAccess.getDecompositionCategoryAccess().getInc_orEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDecompositionCategoryAccess().getInc_orEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleDecompositionCategory"


    // $ANTLR start "ruleCorrelationCategory"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2336:1: ruleCorrelationCategory returns [Enumerator current=null] : ( (enumLiteral_0= 'make' ) | (enumLiteral_1= 'break' ) | (enumLiteral_2= 'help' ) | (enumLiteral_3= 'hurt' ) | (enumLiteral_4= 'unknown' ) ) ;
    public final Enumerator ruleCorrelationCategory() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2338:28: ( ( (enumLiteral_0= 'make' ) | (enumLiteral_1= 'break' ) | (enumLiteral_2= 'help' ) | (enumLiteral_3= 'hurt' ) | (enumLiteral_4= 'unknown' ) ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2339:1: ( (enumLiteral_0= 'make' ) | (enumLiteral_1= 'break' ) | (enumLiteral_2= 'help' ) | (enumLiteral_3= 'hurt' ) | (enumLiteral_4= 'unknown' ) )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2339:1: ( (enumLiteral_0= 'make' ) | (enumLiteral_1= 'break' ) | (enumLiteral_2= 'help' ) | (enumLiteral_3= 'hurt' ) | (enumLiteral_4= 'unknown' ) )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt45=1;
                }
                break;
            case 67:
                {
                alt45=2;
                }
                break;
            case 68:
                {
                alt45=3;
                }
                break;
            case 69:
                {
                alt45=4;
                }
                break;
            case 70:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2339:2: (enumLiteral_0= 'make' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2339:2: (enumLiteral_0= 'make' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2339:4: enumLiteral_0= 'make'
                    {
                    enumLiteral_0=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleCorrelationCategory5219); 

                            current = grammarAccess.getCorrelationCategoryAccess().getMakeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCorrelationCategoryAccess().getMakeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2345:6: (enumLiteral_1= 'break' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2345:6: (enumLiteral_1= 'break' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2345:8: enumLiteral_1= 'break'
                    {
                    enumLiteral_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleCorrelationCategory5236); 

                            current = grammarAccess.getCorrelationCategoryAccess().getBreakEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCorrelationCategoryAccess().getBreakEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2351:6: (enumLiteral_2= 'help' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2351:6: (enumLiteral_2= 'help' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2351:8: enumLiteral_2= 'help'
                    {
                    enumLiteral_2=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleCorrelationCategory5253); 

                            current = grammarAccess.getCorrelationCategoryAccess().getHelpEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCorrelationCategoryAccess().getHelpEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2357:6: (enumLiteral_3= 'hurt' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2357:6: (enumLiteral_3= 'hurt' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2357:8: enumLiteral_3= 'hurt'
                    {
                    enumLiteral_3=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleCorrelationCategory5270); 

                            current = grammarAccess.getCorrelationCategoryAccess().getHurtEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCorrelationCategoryAccess().getHurtEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2363:6: (enumLiteral_4= 'unknown' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2363:6: (enumLiteral_4= 'unknown' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2363:8: enumLiteral_4= 'unknown'
                    {
                    enumLiteral_4=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleCorrelationCategory5287); 

                            current = grammarAccess.getCorrelationCategoryAccess().getUnknownEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getCorrelationCategoryAccess().getUnknownEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleCorrelationCategory"


    // $ANTLR start "rulePrimitiveTypes"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2373:1: rulePrimitiveTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'substitute' ) ) ;
    public final Enumerator rulePrimitiveTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2375:28: ( ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'substitute' ) ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2376:1: ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'substitute' ) )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2376:1: ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'substitute' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==71) ) {
                alt46=1;
            }
            else if ( (LA46_0==72) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2376:2: (enumLiteral_0= 'include' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2376:2: (enumLiteral_0= 'include' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2376:4: enumLiteral_0= 'include'
                    {
                    enumLiteral_0=(Token)match(input,71,FollowSets000.FOLLOW_71_in_rulePrimitiveTypes5332); 

                            current = grammarAccess.getPrimitiveTypesAccess().getIncludeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypesAccess().getIncludeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2382:6: (enumLiteral_1= 'substitute' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2382:6: (enumLiteral_1= 'substitute' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2382:8: enumLiteral_1= 'substitute'
                    {
                    enumLiteral_1=(Token)match(input,72,FollowSets000.FOLLOW_72_in_rulePrimitiveTypes5349); 

                            current = grammarAccess.getPrimitiveTypesAccess().getSubstituteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypesAccess().getSubstituteEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "rulePrimitiveTypes"


    // $ANTLR start "ruleOperatorTypes"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2392:1: ruleOperatorTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) ) ;
    public final Enumerator ruleOperatorTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2394:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2395:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2395:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'not' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt47=1;
                }
                break;
            case 63:
                {
                alt47=2;
                }
                break;
            case 73:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2395:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2395:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2395:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleOperatorTypes5394); 

                            current = grammarAccess.getOperatorTypesAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorTypesAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2401:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2401:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2401:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleOperatorTypes5411); 

                            current = grammarAccess.getOperatorTypesAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorTypesAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2407:6: (enumLiteral_2= 'not' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2407:6: (enumLiteral_2= 'not' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2407:8: enumLiteral_2= 'not'
                    {
                    enumLiteral_2=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleOperatorTypes5428); 

                            current = grammarAccess.getOperatorTypesAccess().getNotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorTypesAccess().getNotEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleOperatorTypes"


    // $ANTLR start "ruleAdviceCategory"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2417:1: ruleAdviceCategory returns [Enumerator current=null] : ( (enumLiteral_0= 'around' ) | (enumLiteral_1= 'before' ) | (enumLiteral_2= 'after' ) ) ;
    public final Enumerator ruleAdviceCategory() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2419:28: ( ( (enumLiteral_0= 'around' ) | (enumLiteral_1= 'before' ) | (enumLiteral_2= 'after' ) ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2420:1: ( (enumLiteral_0= 'around' ) | (enumLiteral_1= 'before' ) | (enumLiteral_2= 'after' ) )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2420:1: ( (enumLiteral_0= 'around' ) | (enumLiteral_1= 'before' ) | (enumLiteral_2= 'after' ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt48=1;
                }
                break;
            case 75:
                {
                alt48=2;
                }
                break;
            case 76:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2420:2: (enumLiteral_0= 'around' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2420:2: (enumLiteral_0= 'around' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2420:4: enumLiteral_0= 'around'
                    {
                    enumLiteral_0=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleAdviceCategory5473); 

                            current = grammarAccess.getAdviceCategoryAccess().getAroundEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAdviceCategoryAccess().getAroundEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2426:6: (enumLiteral_1= 'before' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2426:6: (enumLiteral_1= 'before' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2426:8: enumLiteral_1= 'before'
                    {
                    enumLiteral_1=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleAdviceCategory5490); 

                            current = grammarAccess.getAdviceCategoryAccess().getBeforeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAdviceCategoryAccess().getBeforeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2432:6: (enumLiteral_2= 'after' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2432:6: (enumLiteral_2= 'after' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2432:8: enumLiteral_2= 'after'
                    {
                    enumLiteral_2=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleAdviceCategory5507); 

                            current = grammarAccess.getAdviceCategoryAccess().getAfterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAdviceCategoryAccess().getAfterEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleAdviceCategory"


    // $ANTLR start "ruleIntertypeCategory"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2442:1: ruleIntertypeCategory returns [Enumerator current=null] : ( (enumLiteral_0= 'element' ) | (enumLiteral_1= 'attribute' ) ) ;
    public final Enumerator ruleIntertypeCategory() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2444:28: ( ( (enumLiteral_0= 'element' ) | (enumLiteral_1= 'attribute' ) ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2445:1: ( (enumLiteral_0= 'element' ) | (enumLiteral_1= 'attribute' ) )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2445:1: ( (enumLiteral_0= 'element' ) | (enumLiteral_1= 'attribute' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==17) ) {
                alt49=1;
            }
            else if ( (LA49_0==77) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2445:2: (enumLiteral_0= 'element' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2445:2: (enumLiteral_0= 'element' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2445:4: enumLiteral_0= 'element'
                    {
                    enumLiteral_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleIntertypeCategory5552); 

                            current = grammarAccess.getIntertypeCategoryAccess().getElementEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIntertypeCategoryAccess().getElementEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2451:6: (enumLiteral_1= 'attribute' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2451:6: (enumLiteral_1= 'attribute' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2451:8: enumLiteral_1= 'attribute'
                    {
                    enumLiteral_1=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleIntertypeCategory5569); 

                            current = grammarAccess.getIntertypeCategoryAccess().getAttributeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getIntertypeCategoryAccess().getAttributeEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleIntertypeCategory"


    // $ANTLR start "ruleIsFeatureTypes"
    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2461:1: ruleIsFeatureTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'no' ) | (enumLiteral_1= 'yes' ) ) ;
    public final Enumerator ruleIsFeatureTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2463:28: ( ( (enumLiteral_0= 'no' ) | (enumLiteral_1= 'yes' ) ) )
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2464:1: ( (enumLiteral_0= 'no' ) | (enumLiteral_1= 'yes' ) )
            {
            // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2464:1: ( (enumLiteral_0= 'no' ) | (enumLiteral_1= 'yes' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==78) ) {
                alt50=1;
            }
            else if ( (LA50_0==79) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2464:2: (enumLiteral_0= 'no' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2464:2: (enumLiteral_0= 'no' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2464:4: enumLiteral_0= 'no'
                    {
                    enumLiteral_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleIsFeatureTypes5614); 

                            current = grammarAccess.getIsFeatureTypesAccess().getNoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIsFeatureTypesAccess().getNoEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2470:6: (enumLiteral_1= 'yes' )
                    {
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2470:6: (enumLiteral_1= 'yes' )
                    // ../org.xtext.plaovgraph/src-gen/org/xtext/plaovgraph/parser/antlr/internal/InternalPLAOVgraph.g:2470:8: enumLiteral_1= 'yes'
                    {
                    enumLiteral_1=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleIsFeatureTypes5631); 

                            current = grammarAccess.getIsFeatureTypesAccess().getYesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getIsFeatureTypesAccess().getYesEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleIsFeatureTypes"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAspect_Oriented_Model_in_entryRuleAspect_Oriented_Model75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAspect_Oriented_Model85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleAspect_Oriented_Model122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAspect_Oriented_Model134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAspect_Oriented_Model146 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAspect_Oriented_Model158 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_ruleGoal_Model_in_ruleAspect_Oriented_Model179 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleAspect_Oriented_Model192 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_ruleGoal_Model_in_ruleAspect_Oriented_Model213 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleAspect_Oriented_Model227 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAspect_Oriented_Model239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGoal_Model_in_entryRuleGoal_Model275 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGoal_Model285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGoal_Model_Impl_in_ruleGoal_Model332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_ruleGoal_Model359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship394 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationship404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContribution_in_ruleRelationship451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCorrelation_in_ruleRelationship478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCrosscutting_in_ruleRelationship505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty540 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsFeature_in_ruleProperty597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardinality_in_ruleProperty624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupFeature_in_ruleProperty651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneric_Property_in_ruleProperty678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGoal_Model_Impl_in_entryRuleGoal_Model_Impl713 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGoal_Model_Impl723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleGoal_Model_Impl769 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGoal_Model_Impl790 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGoal_Model_Impl802 = new BitSet(new long[]{0x00000000000E8000L});
        public static final BitSet FOLLOW_17_in_ruleGoal_Model_Impl815 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGoal_Model_Impl827 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_ruleElement_in_ruleGoal_Model_Impl848 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleGoal_Model_Impl861 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_ruleElement_in_ruleGoal_Model_Impl882 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleGoal_Model_Impl896 = new BitSet(new long[]{0x00000000000C8000L});
        public static final BitSet FOLLOW_18_in_ruleGoal_Model_Impl911 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGoal_Model_Impl923 = new BitSet(new long[]{0x000000000C400000L});
        public static final BitSet FOLLOW_ruleRelationship_in_ruleGoal_Model_Impl944 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleGoal_Model_Impl957 = new BitSet(new long[]{0x000000000C400000L});
        public static final BitSet FOLLOW_ruleRelationship_in_ruleGoal_Model_Impl978 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleGoal_Model_Impl992 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_ruleGoal_Model_Impl1007 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGoal_Model_Impl1019 = new BitSet(new long[]{0x0093000000000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleGoal_Model_Impl1040 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleGoal_Model_Impl1053 = new BitSet(new long[]{0x0093000000000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleGoal_Model_Impl1074 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleGoal_Model_Impl1088 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGoal_Model_Impl1102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1139 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement1261 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleElement1308 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleElement1329 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement1341 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleElement1353 = new BitSet(new long[]{0x3F00000000000000L});
        public static final BitSet FOLLOW_ruleElementTypes_in_ruleElement1374 = new BitSet(new long[]{0x00000000000E8000L});
        public static final BitSet FOLLOW_17_in_ruleElement1387 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement1399 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_ruleElement_in_ruleElement1420 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleElement1433 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_ruleElement_in_ruleElement1454 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleElement1468 = new BitSet(new long[]{0x00000000000C8000L});
        public static final BitSet FOLLOW_18_in_ruleElement1483 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement1495 = new BitSet(new long[]{0x000000000C400000L});
        public static final BitSet FOLLOW_ruleRelationship_in_ruleElement1516 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleElement1529 = new BitSet(new long[]{0x000000000C400000L});
        public static final BitSet FOLLOW_ruleRelationship_in_ruleElement1550 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleElement1564 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_ruleElement1579 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElement1591 = new BitSet(new long[]{0x0093000000000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleElement1612 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleElement1625 = new BitSet(new long[]{0x0093000000000000L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleElement1646 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleElement1660 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleElement1674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution1710 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContribution1720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleContribution1757 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContribution1769 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleContribution1781 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_ruleDecompositionCategory_in_ruleContribution1802 = new BitSet(new long[]{0x0000000003008000L});
        public static final BitSet FOLLOW_24_in_ruleContribution1815 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContribution1838 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleContribution1853 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContribution1876 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleContribution1890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCorrelation_in_entryRuleCorrelation1926 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCorrelation1936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleCorrelation1973 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCorrelation1985 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleCorrelation1997 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007CL});
        public static final BitSet FOLLOW_ruleCorrelationCategory_in_ruleCorrelation2018 = new BitSet(new long[]{0x0000000003008000L});
        public static final BitSet FOLLOW_24_in_ruleCorrelation2031 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCorrelation2054 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleCorrelation2069 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCorrelation2092 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCorrelation2106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCrosscutting_in_entryRuleCrosscutting2142 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCrosscutting2152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleCrosscutting2189 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCrosscutting2201 = new BitSet(new long[]{0x0000000013000000L});
        public static final BitSet FOLLOW_24_in_ruleCrosscutting2214 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCrosscutting2237 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleCrosscutting2252 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCrosscutting2275 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleCrosscutting2289 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCrosscutting2301 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rulePointcut_in_ruleCrosscutting2322 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleCrosscutting2335 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rulePointcut_in_ruleCrosscutting2356 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleCrosscutting2370 = new BitSet(new long[]{0x0000000060008000L});
        public static final BitSet FOLLOW_29_in_ruleCrosscutting2383 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCrosscutting2395 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleAdvice_in_ruleCrosscutting2416 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleCrosscutting2429 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleAdvice_in_ruleCrosscutting2450 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleCrosscutting2464 = new BitSet(new long[]{0x0000000040008000L});
        public static final BitSet FOLLOW_30_in_ruleCrosscutting2479 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCrosscutting2491 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleIntertypeDeclaration_in_ruleCrosscutting2512 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleCrosscutting2525 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleIntertypeDeclaration_in_ruleCrosscutting2546 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleCrosscutting2560 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCrosscutting2574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePointcut_in_entryRulePointcut2610 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePointcut2620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rulePointcut2657 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePointcut2678 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePointcut2690 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulePointcut2702 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePointcut2714 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleOperand_in_rulePointcut2735 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_rulePointcut2748 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_ruleOperand_in_rulePointcut2769 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_rulePointcut2783 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePointcut2795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdvice_in_entryRuleAdvice2831 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdvice2841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleAdvice2878 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAdvice2890 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAdvice2902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
        public static final BitSet FOLLOW_ruleAdviceCategory_in_ruleAdvice2923 = new BitSet(new long[]{0x0000002400000000L});
        public static final BitSet FOLLOW_34_in_ruleAdvice2936 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleAdvice2948 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAdvice2971 = new BitSet(new long[]{0x0000001000004000L});
        public static final BitSet FOLLOW_14_in_ruleAdvice2984 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAdvice3007 = new BitSet(new long[]{0x0000001000004000L});
        public static final BitSet FOLLOW_36_in_ruleAdvice3021 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleAdvice3035 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleAdvice3047 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAdvice3070 = new BitSet(new long[]{0x0000001000004000L});
        public static final BitSet FOLLOW_14_in_ruleAdvice3083 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAdvice3106 = new BitSet(new long[]{0x0000001000004000L});
        public static final BitSet FOLLOW_36_in_ruleAdvice3120 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAdvice3132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntertypeDeclaration_in_entryRuleIntertypeDeclaration3168 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntertypeDeclaration3178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleIntertypeDeclaration3215 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIntertypeDeclaration3227 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleIntertypeDeclaration3239 = new BitSet(new long[]{0x0000000000020000L,0x0000000000002000L});
        public static final BitSet FOLLOW_ruleIntertypeCategory_in_ruleIntertypeDeclaration3260 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleIntertypeDeclaration3272 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleIntertypeDeclaration3284 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntertypeDeclaration3307 = new BitSet(new long[]{0x0000001000004000L});
        public static final BitSet FOLLOW_14_in_ruleIntertypeDeclaration3320 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntertypeDeclaration3343 = new BitSet(new long[]{0x0000001000004000L});
        public static final BitSet FOLLOW_36_in_ruleIntertypeDeclaration3357 = new BitSet(new long[]{0x0000018000008000L});
        public static final BitSet FOLLOW_39_in_ruleIntertypeDeclaration3370 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIntertypeDeclaration3382 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_ruleElement_in_ruleIntertypeDeclaration3403 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleIntertypeDeclaration3416 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_ruleElement_in_ruleIntertypeDeclaration3437 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleIntertypeDeclaration3451 = new BitSet(new long[]{0x0000010000008000L});
        public static final BitSet FOLLOW_40_in_ruleIntertypeDeclaration3466 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIntertypeDeclaration3478 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleIntertypeDeclaration3499 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleIntertypeDeclaration3512 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleIntertypeDeclaration3533 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleIntertypeDeclaration3547 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIntertypeDeclaration3561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand3597 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperand3607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleOperand3644 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOperand3656 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleOperand3668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
        public static final BitSet FOLLOW_rulePrimitiveTypes_in_ruleOperand3689 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleOperand3701 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOperand3724 = new BitSet(new long[]{0x0000100000008000L});
        public static final BitSet FOLLOW_44_in_ruleOperand3737 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_ruleOperator_in_ruleOperand3758 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOperand3772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperator_in_entryRuleOperator3808 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperator3818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleOperator3855 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOperator3867 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleOperator3879 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_ruleOperatorTypes_in_ruleOperator3900 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOperator3912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute3948 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute3958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleAttribute3995 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAttribute4007 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAttribute4019 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttribute4040 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleAttribute4052 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttribute4073 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAttribute4085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIsFeature_in_entryRuleIsFeature4121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIsFeature4131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleIsFeature4168 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIsFeature4180 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleIsFeature4192 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
        public static final BitSet FOLLOW_ruleIsFeatureTypes_in_ruleIsFeature4213 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIsFeature4225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality4261 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCardinality4271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleCardinality4308 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCardinality4320 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleCardinality4332 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCardinality4353 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleCardinality4365 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCardinality4386 = new BitSet(new long[]{0x0000000003008000L});
        public static final BitSet FOLLOW_24_in_ruleCardinality4399 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCardinality4422 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleCardinality4437 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCardinality4460 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCardinality4474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupFeature_in_entryRuleGroupFeature4510 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroupFeature4520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleGroupFeature4557 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGroupFeature4569 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleGroupFeature4581 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroupFeature4602 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleGroupFeature4614 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroupFeature4635 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleGroupFeature4647 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleGroupFeature4659 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroupFeature4682 = new BitSet(new long[]{0x0000001000004000L});
        public static final BitSet FOLLOW_14_in_ruleGroupFeature4695 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroupFeature4718 = new BitSet(new long[]{0x0000001000004000L});
        public static final BitSet FOLLOW_36_in_ruleGroupFeature4732 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_25_in_ruleGroupFeature4745 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroupFeature4768 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGroupFeature4782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneric_Property_in_entryRuleGeneric_Property4818 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGeneric_Property4828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleGeneric_Property4865 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGeneric_Property4886 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGeneric_Property4898 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleGeneric_Property4910 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGeneric_Property4931 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGeneric_Property4943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleElementTypes4993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleElementTypes5010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleElementTypes5027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleElementTypes5044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleElementTypes5061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleElementTypes5078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleDecompositionCategory5123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleDecompositionCategory5140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleDecompositionCategory5157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleDecompositionCategory5174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleCorrelationCategory5219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleCorrelationCategory5236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleCorrelationCategory5253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleCorrelationCategory5270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleCorrelationCategory5287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_rulePrimitiveTypes5332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_rulePrimitiveTypes5349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleOperatorTypes5394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleOperatorTypes5411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleOperatorTypes5428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleAdviceCategory5473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleAdviceCategory5490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleAdviceCategory5507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleIntertypeCategory5552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleIntertypeCategory5569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleIsFeatureTypes5614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleIsFeatureTypes5631 = new BitSet(new long[]{0x0000000000000002L});
    }


}