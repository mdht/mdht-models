/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Advance Directives Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAdvanceDirectivesSection#validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSAdvanceDirectivesSectionOperations extends SectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected EMSAdvanceDirectivesSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSAdvanceDirectivesSectionTemplateId(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionTemplateId(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.12')";

	/**
	* The cached OCL invariant for the '{@link #validateEMSAdvanceDirectivesSectionTemplateId(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionTemplateId(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsAdvanceDirectivesSection The receiving '<em><b>EMS Advance Directives Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSAdvanceDirectivesSectionTemplateId(
			EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION);
			try {
				VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsAdvanceDirectivesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("EMSAdvanceDirectivesSectionTemplateId"),
					new Object[] { emsAdvanceDirectivesSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSAdvanceDirectivesSectionCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67840-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateEMSAdvanceDirectivesSectionCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsAdvanceDirectivesSection The receiving '<em><b>EMS Advance Directives Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSAdvanceDirectivesSectionCode(
			EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION);
			try {
				VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsAdvanceDirectivesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSAdvanceDirectivesSectionCode"),
					new Object[] { emsAdvanceDirectivesSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSAdvanceDirectivesSectionTitle(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionTitle(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Advance Directives Section')";

	/**
	* The cached OCL invariant for the '{@link #validateEMSAdvanceDirectivesSectionTitle(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionTitle(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsAdvanceDirectivesSection The receiving '<em><b>EMS Advance Directives Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSAdvanceDirectivesSectionTitle(
			EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION);
			try {
				VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsAdvanceDirectivesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("EMSAdvanceDirectivesSectionTitle"),
					new Object[] { emsAdvanceDirectivesSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSAdvanceDirectivesSectionText(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionText(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateEMSAdvanceDirectivesSectionText(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionText(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsAdvanceDirectivesSection The receiving '<em><b>EMS Advance Directives Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSAdvanceDirectivesSectionText(
			EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION);
			try {
				VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsAdvanceDirectivesSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("EMSAdvanceDirectivesSectionText"),
					new Object[] { emsAdvanceDirectivesSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationTemplateId(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationTemplateId(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null).observation->excluding(null)->reject(templateId->exists(id : datatypes::II | id.root = 'null'))";

	/**
	* The cached OCL invariant for the '{@link #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationTemplateId(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationTemplateId(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsAdvanceDirectivesSection The receiving '<em><b>EMS Advance Directives Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationTemplateId(
			EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(emsAdvanceDirectivesSection);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						EmspcrValidator.DIAGNOSTIC_SOURCE,
						EmspcrValidator.EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_TEMPLATE_ID,
						EmspcrPlugin.INSTANCE.getString("EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationTemplateId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = code.oclAsType(datatypes::CD) in "
			+ "value.code = '67516-5' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	* The cached OCL invariant for the '{@link #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsAdvanceDirectivesSection The receiving '<em><b>EMS Advance Directives Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationCode(
			EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(emsAdvanceDirectivesSection);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						EmspcrValidator.DIAGNOSTIC_SOURCE,
						EmspcrValidator.EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_CODE,
						EmspcrPlugin.INSTANCE.getString("EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValue(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValue(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA137-2' or value.code = 'LA17059-9' or value.code = 'LA17319-7' or value.code = 'LA17320-5' or value.code = 'LA17321-3' or value.code = 'LA17322-1'))))";

	/**
	* The cached OCL invariant for the '{@link #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValue(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValue(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsAdvanceDirectivesSection The receiving '<em><b>EMS Advance Directives Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValue(
			EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(emsAdvanceDirectivesSection);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						EmspcrValidator.DIAGNOSTIC_SOURCE,
						EmspcrValidator.EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_VALUE,
						EmspcrPlugin.INSTANCE.getString("EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValue"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValueP(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation Value P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValueP(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

	/**
	* The cached OCL invariant for the '{@link #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValueP(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation Value P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValueP(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsAdvanceDirectivesSection The receiving '<em><b>EMS Advance Directives Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValueP(
			EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(emsAdvanceDirectivesSection);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						EmspcrValidator.DIAGNOSTIC_SOURCE,
						EmspcrValidator.EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_VALUE_P,
						EmspcrPlugin.INSTANCE.getString("EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationValueP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationMoodCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationMoodCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

	/**
	* The cached OCL invariant for the '{@link #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationMoodCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationMoodCode(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsAdvanceDirectivesSection The receiving '<em><b>EMS Advance Directives Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationMoodCode(
			EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(emsAdvanceDirectivesSection);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						EmspcrValidator.DIAGNOSTIC_SOURCE,
						EmspcrValidator.EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION_MOOD_CODE,
						EmspcrPlugin.INSTANCE.getString("EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservationMoodCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->excluding(null)->reject(observation->exists(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	* The cached OCL invariant for the '{@link #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Advance Directives Section EMS Advanced Directive Entry EMS Advanced Directive Observation</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation(EMSAdvanceDirectivesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param emsAdvanceDirectivesSection The receiving '<em><b>EMS Advance Directives Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateEMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation(
			EMSAdvanceDirectivesSection emsAdvanceDirectivesSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_ADVANCE_DIRECTIVES_SECTION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(emsAdvanceDirectivesSection);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						EmspcrValidator.DIAGNOSTIC_SOURCE,
						EmspcrValidator.EMS_ADVANCE_DIRECTIVES_SECTION__EMS_ADVANCE_DIRECTIVES_SECTION_EMS_ADVANCED_DIRECTIVE_ENTRY_EMS_ADVANCED_DIRECTIVE_OBSERVATION,
						EmspcrPlugin.INSTANCE.getString("EMSAdvanceDirectivesSectionEMSAdvancedDirectiveEntryEMSAdvancedDirectiveObservation"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // EMSAdvanceDirectivesSectionOperations
