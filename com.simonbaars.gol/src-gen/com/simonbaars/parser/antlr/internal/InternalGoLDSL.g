/*
 * generated by Xtext 2.19.0
 */
grammar InternalGoLDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.simonbaars.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.simonbaars.parser.antlr.internal;

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
import com.simonbaars.services.GoLDSLGrammarAccess;

}

@parser::members {

 	private GoLDSLGrammarAccess grammarAccess;

    public InternalGoLDSLParser(TokenStream input, GoLDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "DSL";
   	}

   	@Override
   	protected GoLDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDSL
entryRuleDSL returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDSLRule()); }
	iv_ruleDSL=ruleDSL
	{ $current=$iv_ruleDSL.current; }
	EOF;

// Rule DSL
ruleDSL returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDSLAccess().getBoardBoardParserRuleCall_0_0());
				}
				lv_board_0_0=ruleBoard
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDSLRule());
					}
					set(
						$current,
						"board",
						lv_board_0_0,
						"com.simonbaars.GoLDSL.Board");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getDSLAccess().getRulesRuleParserRuleCall_1_0_0());
					}
					lv_rules_1_0=ruleRule
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDSLRule());
						}
						add(
							$current,
							"rules",
							lv_rules_1_0,
							"com.simonbaars.GoLDSL.Rule");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getDSLAccess().getShapesShapeDefParserRuleCall_1_1_0());
					}
					lv_shapes_2_0=ruleShapeDef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDSLRule());
						}
						add(
							$current,
							"shapes",
							lv_shapes_2_0,
							"com.simonbaars.GoLDSL.ShapeDef");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleBoard
entryRuleBoard returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBoardRule()); }
	iv_ruleBoard=ruleBoard
	{ $current=$iv_ruleBoard.current; }
	EOF;

// Rule Board
ruleBoard returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Board:'
		{
			newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getBoardAccess().getObjectsParserRuleCall_1());
		}
		this_Objects_1=ruleObjects
		{
			$current = $this_Objects_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleObjects
entryRuleObjects returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectsRule()); }
	iv_ruleObjects=ruleObjects
	{ $current=$iv_ruleObjects.current; }
	EOF;

// Rule Objects
ruleObjects returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getObjectsAccess().getShapesShapeRefParserRuleCall_0_0());
				}
				lv_shapes_0_0=ruleShapeRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObjectsRule());
					}
					add(
						$current,
						"shapes",
						lv_shapes_0_0,
						"com.simonbaars.GoLDSL.ShapeRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getObjectsAccess().getCellCellDefParserRuleCall_1_0());
				}
				lv_cell_1_0=ruleCellDef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObjectsRule());
					}
					add(
						$current,
						"cell",
						lv_cell_1_0,
						"com.simonbaars.GoLDSL.CellDef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getObjectsAccess().getCellsCellsParserRuleCall_2_0());
				}
				lv_cells_2_0=ruleCells
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObjectsRule());
					}
					add(
						$current,
						"cells",
						lv_cells_2_0,
						"com.simonbaars.GoLDSL.Cells");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getObjectsAccess().getGridsGridParserRuleCall_3_0());
				}
				lv_grids_3_0=ruleGrid
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObjectsRule());
					}
					add(
						$current,
						"grids",
						lv_grids_3_0,
						"com.simonbaars.GoLDSL.Grid");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)+
;

// Entry rule entryRuleShapeDef
entryRuleShapeDef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getShapeDefRule()); }
	iv_ruleShapeDef=ruleShapeDef
	{ $current=$iv_ruleShapeDef.current; }
	EOF;

// Rule ShapeDef
ruleShapeDef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Shape'
		{
			newLeafNode(otherlv_0, grammarAccess.getShapeDefAccess().getShapeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getShapeDefAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getShapeDefRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getShapeDefAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getShapeDefAccess().getOffsetOffsetParserRuleCall_3_0());
				}
				lv_offset_3_0=ruleOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getShapeDefRule());
					}
					set(
						$current,
						"offset",
						lv_offset_3_0,
						"com.simonbaars.GoLDSL.Offset");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getShapeDefAccess().getObjectsObjectsParserRuleCall_4_0());
				}
				lv_objects_4_0=ruleObjects
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getShapeDefRule());
					}
					set(
						$current,
						"objects",
						lv_objects_4_0,
						"com.simonbaars.GoLDSL.Objects");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCellPairs
entryRuleCellPairs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCellPairsRule()); }
	iv_ruleCellPairs=ruleCellPairs
	{ $current=$iv_ruleCellPairs.current; }
	EOF;

// Rule CellPairs
ruleCellPairs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getCellPairsAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCellPairsAccess().getCellsCellParserRuleCall_1_0());
				}
				lv_cells_1_0=ruleCell
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCellPairsRule());
					}
					add(
						$current,
						"cells",
						lv_cells_1_0,
						"com.simonbaars.GoLDSL.Cell");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getCellPairsAccess().getRightParenthesisKeyword_2());
		}
	)+
;

// Entry rule entryRuleCells
entryRuleCells returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCellsRule()); }
	iv_ruleCells=ruleCells
	{ $current=$iv_ruleCells.current; }
	EOF;

// Rule Cells
ruleCells returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Cells:'
		{
			newLeafNode(otherlv_0, grammarAccess.getCellsAccess().getCellsKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getCellsAccess().getCellPairsParserRuleCall_1());
		}
		this_CellPairs_1=ruleCellPairs
		{
			$current = $this_CellPairs_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCellDef
entryRuleCellDef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCellDefRule()); }
	iv_ruleCellDef=ruleCellDef
	{ $current=$iv_ruleCellDef.current; }
	EOF;

// Rule CellDef
ruleCellDef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Cell:'
		{
			newLeafNode(otherlv_0, grammarAccess.getCellDefAccess().getCellKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCellDefAccess().getOffsetOffsetParserRuleCall_1_0());
				}
				lv_offset_1_0=ruleOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCellDefRule());
					}
					set(
						$current,
						"offset",
						lv_offset_1_0,
						"com.simonbaars.GoLDSL.Offset");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getCellDefAccess().getCellCellParserRuleCall_2_0());
				}
				lv_cell_2_0=ruleCell
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCellDefRule());
					}
					set(
						$current,
						"cell",
						lv_cell_2_0,
						"com.simonbaars.GoLDSL.Cell");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleShapeRef
entryRuleShapeRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getShapeRefRule()); }
	iv_ruleShapeRef=ruleShapeRef
	{ $current=$iv_ruleShapeRef.current; }
	EOF;

// Rule ShapeRef
ruleShapeRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Shape'
		{
			newLeafNode(otherlv_0, grammarAccess.getShapeRefAccess().getShapeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getShapeRefAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getShapeRefRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getShapeRefAccess().getColonKeyword_2());
		}
		(
			(
				lv_x_3_0=RULE_INT
				{
					newLeafNode(lv_x_3_0, grammarAccess.getShapeRefAccess().getXINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getShapeRefRule());
					}
					setWithLastConsumed(
						$current,
						"x",
						lv_x_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4=','
		{
			newLeafNode(otherlv_4, grammarAccess.getShapeRefAccess().getCommaKeyword_4());
		}
		(
			(
				lv_y_5_0=RULE_INT
				{
					newLeafNode(lv_y_5_0, grammarAccess.getShapeRefAccess().getYINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getShapeRefRule());
					}
					setWithLastConsumed(
						$current,
						"y",
						lv_y_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleCell
entryRuleCell returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCellRule()); }
	iv_ruleCell=ruleCell
	{ $current=$iv_ruleCell.current; }
	EOF;

// Rule Cell
ruleCell returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_x_0_0=RULE_INT
				{
					newLeafNode(lv_x_0_0, grammarAccess.getCellAccess().getXINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCellRule());
					}
					setWithLastConsumed(
						$current,
						"x",
						lv_x_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_1=','
		{
			newLeafNode(otherlv_1, grammarAccess.getCellAccess().getCommaKeyword_1());
		}
		(
			(
				lv_y_2_0=RULE_INT
				{
					newLeafNode(lv_y_2_0, grammarAccess.getCellAccess().getYINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCellRule());
					}
					setWithLastConsumed(
						$current,
						"y",
						lv_y_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Rule:'
		{
			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_1_0());
				}
				lv_condition_1_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"condition",
						lv_condition_1_0,
						"com.simonbaars.GoLDSL.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRuleAccess().getActionActionParserRuleCall_2_0());
				}
				lv_action_2_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRuleRule());
					}
					set(
						$current,
						"action",
						lv_action_2_0,
						"com.simonbaars.GoLDSL.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Create'
		{
			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getCreateKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getActionAccess().getObjectsParserRuleCall_1());
		}
		this_Objects_1=ruleObjects
		{
			$current = $this_Objects_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='If'
		{
			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getConditionAccess().getConditionRulesParserRuleCall_1());
		}
		this_ConditionRules_1=ruleConditionRules
		{
			$current = $this_ConditionRules_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleConditionRule
entryRuleConditionRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRuleRule()); }
	iv_ruleConditionRule=ruleConditionRule
	{ $current=$iv_ruleConditionRule.current; }
	EOF;

// Rule ConditionRule
ruleConditionRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_number_0_0=RULE_INT
				{
					newLeafNode(lv_number_0_0, grammarAccess.getConditionRuleAccess().getNumberINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConditionRuleRule());
					}
					setWithLastConsumed(
						$current,
						"number",
						lv_number_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionRuleAccess().getRangeRangeParserRuleCall_1_0());
				}
				lv_range_1_0=ruleRange
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRuleRule());
					}
					set(
						$current,
						"range",
						lv_range_1_0,
						"com.simonbaars.GoLDSL.Range");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				lv_alive_2_0='Alive'
				{
					newLeafNode(lv_alive_2_0, grammarAccess.getConditionRuleAccess().getAliveAliveKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConditionRuleRule());
					}
					setWithLastConsumed($current, "alive", lv_alive_2_0, "Alive");
				}
			)
		)
		    |
		(
			(
				lv_dead_3_0='Dead'
				{
					newLeafNode(lv_dead_3_0, grammarAccess.getConditionRuleAccess().getDeadDeadKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConditionRuleRule());
					}
					setWithLastConsumed($current, "dead", lv_dead_3_0, "Dead");
				}
			)
		)
	)
;

// Entry rule entryRuleConditionRules
entryRuleConditionRules returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRulesRule()); }
	iv_ruleConditionRules=ruleConditionRules
	{ $current=$iv_ruleConditionRules.current; }
	EOF;

// Rule ConditionRules
ruleConditionRules returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionRulesAccess().getRule1ConditionRuleParserRuleCall_0_0());
				}
				lv_rule1_0_0=ruleConditionRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRulesRule());
					}
					set(
						$current,
						"rule1",
						lv_rule1_0_0,
						"com.simonbaars.GoLDSL.ConditionRule");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionRulesAccess().getOperatorBoolOperatorEnumRuleCall_1_0_0());
					}
					lv_operator_1_0=ruleBoolOperator
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionRulesRule());
						}
						set(
							$current,
							"operator",
							lv_operator_1_0,
							"com.simonbaars.GoLDSL.BoolOperator");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionRulesAccess().getRule2ConditionRulesParserRuleCall_1_1_0());
					}
					lv_rule2_2_0=ruleConditionRules
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionRulesRule());
						}
						set(
							$current,
							"rule2",
							lv_rule2_2_0,
							"com.simonbaars.GoLDSL.ConditionRules");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleRange
entryRuleRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRangeRule()); }
	iv_ruleRange=ruleRange
	{ $current=$iv_ruleRange.current; }
	EOF;

// Rule Range
ruleRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRangeAccess().getBoundedRangeParserRuleCall_0());
		}
		this_BoundedRange_0=ruleBoundedRange
		{
			$current = $this_BoundedRange_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRangeAccess().getLeftUnboundedRangeParserRuleCall_1());
		}
		this_LeftUnboundedRange_1=ruleLeftUnboundedRange
		{
			$current = $this_LeftUnboundedRange_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRangeAccess().getRightUnboundedRangeParserRuleCall_2());
		}
		this_RightUnboundedRange_2=ruleRightUnboundedRange
		{
			$current = $this_RightUnboundedRange_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBoundedRange
entryRuleBoundedRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBoundedRangeRule()); }
	iv_ruleBoundedRange=ruleBoundedRange
	{ $current=$iv_ruleBoundedRange.current; }
	EOF;

// Rule BoundedRange
ruleBoundedRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_lowerBound_0_0=RULE_INT
				{
					newLeafNode(lv_lowerBound_0_0, grammarAccess.getBoundedRangeAccess().getLowerBoundINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBoundedRangeRule());
					}
					setWithLastConsumed(
						$current,
						"lowerBound",
						lv_lowerBound_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_1='..'
		{
			newLeafNode(otherlv_1, grammarAccess.getBoundedRangeAccess().getFullStopFullStopKeyword_1());
		}
		(
			(
				lv_higherBound_2_0=RULE_INT
				{
					newLeafNode(lv_higherBound_2_0, grammarAccess.getBoundedRangeAccess().getHigherBoundINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBoundedRangeRule());
					}
					setWithLastConsumed(
						$current,
						"higherBound",
						lv_higherBound_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleLeftUnboundedRange
entryRuleLeftUnboundedRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLeftUnboundedRangeRule()); }
	iv_ruleLeftUnboundedRange=ruleLeftUnboundedRange
	{ $current=$iv_ruleLeftUnboundedRange.current; }
	EOF;

// Rule LeftUnboundedRange
ruleLeftUnboundedRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_lowerBound_0_0=RULE_INT
				{
					newLeafNode(lv_lowerBound_0_0, grammarAccess.getLeftUnboundedRangeAccess().getLowerBoundINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLeftUnboundedRangeRule());
					}
					setWithLastConsumed(
						$current,
						"lowerBound",
						lv_lowerBound_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_1='..'
		{
			newLeafNode(otherlv_1, grammarAccess.getLeftUnboundedRangeAccess().getFullStopFullStopKeyword_1());
		}
	)
;

// Entry rule entryRuleRightUnboundedRange
entryRuleRightUnboundedRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRightUnboundedRangeRule()); }
	iv_ruleRightUnboundedRange=ruleRightUnboundedRange
	{ $current=$iv_ruleRightUnboundedRange.current; }
	EOF;

// Rule RightUnboundedRange
ruleRightUnboundedRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='..'
		{
			newLeafNode(otherlv_0, grammarAccess.getRightUnboundedRangeAccess().getFullStopFullStopKeyword_0());
		}
		(
			(
				lv_higherBound_1_0=RULE_INT
				{
					newLeafNode(lv_higherBound_1_0, grammarAccess.getRightUnboundedRangeAccess().getHigherBoundINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRightUnboundedRangeRule());
					}
					setWithLastConsumed(
						$current,
						"higherBound",
						lv_higherBound_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleGrid
entryRuleGrid returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGridRule()); }
	iv_ruleGrid=ruleGrid
	{ $current=$iv_ruleGrid.current; }
	EOF;

// Rule Grid
ruleGrid returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Grid:'
		{
			newLeafNode(otherlv_0, grammarAccess.getGridAccess().getGridKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGridAccess().getSizeSizeParserRuleCall_1_0());
				}
				lv_size_1_0=ruleSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGridRule());
					}
					set(
						$current,
						"size",
						lv_size_1_0,
						"com.simonbaars.GoLDSL.Size");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGridAccess().getPartsGridPartEnumRuleCall_2_0());
				}
				lv_parts_2_0=ruleGridPart
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGridRule());
					}
					add(
						$current,
						"parts",
						lv_parts_2_0,
						"com.simonbaars.GoLDSL.GridPart");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleOffset
entryRuleOffset returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOffsetRule()); }
	iv_ruleOffset=ruleOffset
	{ $current=$iv_ruleOffset.current; }
	EOF;

// Rule Offset
ruleOffset returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='offset'
		{
			newLeafNode(otherlv_0, grammarAccess.getOffsetAccess().getOffsetKeyword_0());
		}
		(
			(
				lv_x_1_0=RULE_INT
				{
					newLeafNode(lv_x_1_0, grammarAccess.getOffsetAccess().getXINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOffsetRule());
					}
					setWithLastConsumed(
						$current,
						"x",
						lv_x_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_y_2_0=RULE_INT
				{
					newLeafNode(lv_y_2_0, grammarAccess.getOffsetAccess().getYINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOffsetRule());
					}
					setWithLastConsumed(
						$current,
						"y",
						lv_y_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleSize
entryRuleSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSizeRule()); }
	iv_ruleSize=ruleSize
	{ $current=$iv_ruleSize.current; }
	EOF;

// Rule Size
ruleSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='size'
		{
			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
		}
		(
			(
				lv_width_1_0=RULE_INT
				{
					newLeafNode(lv_width_1_0, grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSizeRule());
					}
					setWithLastConsumed(
						$current,
						"width",
						lv_width_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_height_2_0=RULE_INT
				{
					newLeafNode(lv_height_2_0, grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSizeRule());
					}
					setWithLastConsumed(
						$current,
						"height",
						lv_height_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Rule BoolOperator
ruleBoolOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='&'
			{
				$current = grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getBoolOperatorAccess().getANDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='|'
			{
				$current = grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getBoolOperatorAccess().getOREnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule GridPart
ruleGridPart returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='+'
			{
				$current = grammarAccess.getGridPartAccess().getALIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGridPartAccess().getALIVEEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='-'
			{
				$current = grammarAccess.getGridPartAccess().getDEADEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGridPartAccess().getDEADEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
