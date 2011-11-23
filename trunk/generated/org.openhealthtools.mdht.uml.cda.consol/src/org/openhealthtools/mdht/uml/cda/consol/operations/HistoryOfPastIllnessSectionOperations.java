/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Past Illness Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionHasClinicalStatements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Has Clinical Statements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#getCondition() <em>Get Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryOfPastIllnessSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryOfPastIllnessSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfPastIllnessSectionHasClinicalStatements(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Has Clinical Statements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPastIllnessSectionHasClinicalStatements(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entry->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfPastIllnessSectionHasClinicalStatements(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Has Clinical Statements</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPastIllnessSectionHasClinicalStatements(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entry->isEmpty()
	 * @param historyOfPastIllnessSection The receiving '<em><b>History Of Past Illness Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryOfPastIllnessSectionHasClinicalStatements(HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION);
			try {
				VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfPastIllnessSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_OF_PAST_ILLNESS_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_HAS_CLINICAL_STATEMENTS,
						 ConsolPlugin.INSTANCE.getString("HistoryOfPastIllnessSectionHasClinicalStatements"),
						 new Object [] { historyOfPastIllnessSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfPastIllnessSectionTemplateId(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPastIllnessSectionTemplateId(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.104')";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfPastIllnessSectionTemplateId(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPastIllnessSectionTemplateId(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.104')
	 * @param historyOfPastIllnessSection The receiving '<em><b>History Of Past Illness Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryOfPastIllnessSectionTemplateId(HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION);
			try {
				VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfPastIllnessSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_OF_PAST_ILLNESS_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("HistoryOfPastIllnessSectionTemplateId"),
						 new Object [] { historyOfPastIllnessSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfPastIllnessSectionCode(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPastIllnessSectionCode(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '11348-0' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfPastIllnessSectionCode(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPastIllnessSectionCode(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '11348-0' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param historyOfPastIllnessSection The receiving '<em><b>History Of Past Illness Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryOfPastIllnessSectionCode(HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION);
			try {
				VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfPastIllnessSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_OF_PAST_ILLNESS_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("HistoryOfPastIllnessSectionCode"),
						 new Object [] { historyOfPastIllnessSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfPastIllnessSectionCondition(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPastIllnessSectionCondition(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ProblemConcernAct))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfPastIllnessSectionCondition(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Condition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPastIllnessSectionCondition(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::ProblemConcernAct))
	 * @param historyOfPastIllnessSection The receiving '<em><b>History Of Past Illness Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryOfPastIllnessSectionCondition(HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION);
			try {
				VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfPastIllnessSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.HISTORY_OF_PAST_ILLNESS_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_CONDITION,
						 ConsolPlugin.INSTANCE.getString("HistoryOfPastIllnessSectionCondition"),
						 new Object [] { historyOfPastIllnessSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCondition(HistoryOfPastIllnessSection) <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition(HistoryOfPastIllnessSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONDITION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProblemConcernAct))->asSequence()->first().oclAsType(consol::ProblemConcernAct)";

	/**
	 * The cached OCL query for the '{@link #getCondition(HistoryOfPastIllnessSection) <em>Get Condition</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition(HistoryOfPastIllnessSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONDITION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProblemConcernAct))->asSequence()->first().oclAsType(consol::ProblemConcernAct)
	 * @param historyOfPastIllnessSection The receiving '<em><b>History Of Past Illness Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ProblemConcernAct getCondition(HistoryOfPastIllnessSection historyOfPastIllnessSection) {
		if (GET_CONDITION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION, ConsolPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION.getEAllOperations().get(59));
			try {
				GET_CONDITION__EOCL_QRY = helper.createQuery(GET_CONDITION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONDITION__EOCL_QRY);
		return (ProblemConcernAct) query.evaluate(historyOfPastIllnessSection);
	}

} // HistoryOfPastIllnessSectionOperations