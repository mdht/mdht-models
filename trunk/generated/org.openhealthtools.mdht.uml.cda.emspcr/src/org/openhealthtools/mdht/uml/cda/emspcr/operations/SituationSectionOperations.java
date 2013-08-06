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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.Complaint;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity;
import org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms;
import org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury;
import org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom;
import org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression;
import org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions;
import org.openhealthtools.mdht.uml.cda.emspcr.SituationSection;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Situation Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Complaint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionPossibleInjury(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Possible Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionProviderPrimaryImpression(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Provider Primary Impression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionPrimarySymptom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Primary Symptom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionOtherSymptoms(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Other Symptoms</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionProviderSecondaryImpressions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Provider Secondary Impressions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#validateSituationSectionInitialPatientAcuity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Initial Patient Acuity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#getComplaints() <em>Get Complaints</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#getPossibleInjury() <em>Get Possible Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#getProviderPrimaryImpression() <em>Get Provider Primary Impression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#getPrimarySymptom() <em>Get Primary Symptom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#getOtherSymptoms() <em>Get Other Symptoms</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#getProviderSecondaryImpressions() <em>Get Provider Secondary Impressions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SituationSection#getInitialPatientAcuity() <em>Get Initial Patient Acuity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SituationSectionOperations extends SectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected SituationSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateSituationSectionTemplateId(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionTemplateId(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.9')";

	/**
	* The cached OCL invariant for the '{@link #validateSituationSectionTemplateId(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionTemplateId(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param situationSection The receiving '<em><b>Situation Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSituationSectionTemplateId(SituationSection situationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SITUATION_SECTION);
			try {
				VALIDATE_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			situationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SITUATION_SECTION__SITUATION_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("SituationSectionTemplateId"), new Object[] { situationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSituationSectionCode(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionCode(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67666-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateSituationSectionCode(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionCode(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param situationSection The receiving '<em><b>Situation Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSituationSectionCode(SituationSection situationSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SITUATION_SECTION);
			try {
				VALIDATE_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			situationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SITUATION_SECTION__SITUATION_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("SituationSectionCode"), new Object[] { situationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSituationSectionCodeP(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionCodeP(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateSituationSectionCodeP(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionCodeP(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param situationSection The receiving '<em><b>Situation Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSituationSectionCodeP(SituationSection situationSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SITUATION_SECTION);
			try {
				VALIDATE_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			situationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SITUATION_SECTION__SITUATION_SECTION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("SituationSectionCodeP"), new Object[] { situationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSituationSectionTitle(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionTitle(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Situation Section')";

	/**
	* The cached OCL invariant for the '{@link #validateSituationSectionTitle(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionTitle(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param situationSection The receiving '<em><b>Situation Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSituationSectionTitle(SituationSection situationSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SITUATION_SECTION);
			try {
				VALIDATE_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			situationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SITUATION_SECTION__SITUATION_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("SituationSectionTitle"), new Object[] { situationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSituationSectionText(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionText(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateSituationSectionText(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionText(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param situationSection The receiving '<em><b>Situation Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSituationSectionText(SituationSection situationSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SITUATION_SECTION);
			try {
				VALIDATE_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			situationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SITUATION_SECTION__SITUATION_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("SituationSectionText"), new Object[] { situationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSituationSectionComplaint(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Complaint</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionComplaint(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SITUATION_SECTION_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::Complaint) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateSituationSectionComplaint(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Complaint</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionComplaint(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SITUATION_SECTION_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param situationSection The receiving '<em><b>Situation Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSituationSectionComplaint(SituationSection situationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SITUATION_SECTION_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SITUATION_SECTION);
			try {
				VALIDATE_SITUATION_SECTION_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SITUATION_SECTION_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SITUATION_SECTION_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			situationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SITUATION_SECTION__SITUATION_SECTION_COMPLAINT,
					EmspcrPlugin.INSTANCE.getString("SituationSectionComplaint"), new Object[] { situationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSituationSectionPossibleInjury(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Possible Injury</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionPossibleInjury(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SITUATION_SECTION_POSSIBLE_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PossibleInjury) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateSituationSectionPossibleInjury(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Possible Injury</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionPossibleInjury(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SITUATION_SECTION_POSSIBLE_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param situationSection The receiving '<em><b>Situation Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSituationSectionPossibleInjury(SituationSection situationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SITUATION_SECTION_POSSIBLE_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SITUATION_SECTION);
			try {
				VALIDATE_SITUATION_SECTION_POSSIBLE_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SITUATION_SECTION_POSSIBLE_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SITUATION_SECTION_POSSIBLE_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			situationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SITUATION_SECTION__SITUATION_SECTION_POSSIBLE_INJURY,
					EmspcrPlugin.INSTANCE.getString("SituationSectionPossibleInjury"),
					new Object[] { situationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSituationSectionProviderPrimaryImpression(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Provider Primary Impression</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionProviderPrimaryImpression(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ProviderPrimaryImpression) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateSituationSectionProviderPrimaryImpression(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Provider Primary Impression</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionProviderPrimaryImpression(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param situationSection The receiving '<em><b>Situation Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSituationSectionProviderPrimaryImpression(SituationSection situationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SITUATION_SECTION);
			try {
				VALIDATE_SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			situationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SITUATION_SECTION__SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION,
					EmspcrPlugin.INSTANCE.getString("SituationSectionProviderPrimaryImpression"),
					new Object[] { situationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSituationSectionPrimarySymptom(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Primary Symptom</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionPrimarySymptom(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SITUATION_SECTION_PRIMARY_SYMPTOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PrimarySymptom) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateSituationSectionPrimarySymptom(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Primary Symptom</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionPrimarySymptom(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SITUATION_SECTION_PRIMARY_SYMPTOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param situationSection The receiving '<em><b>Situation Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSituationSectionPrimarySymptom(SituationSection situationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SITUATION_SECTION_PRIMARY_SYMPTOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SITUATION_SECTION);
			try {
				VALIDATE_SITUATION_SECTION_PRIMARY_SYMPTOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SITUATION_SECTION_PRIMARY_SYMPTOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SITUATION_SECTION_PRIMARY_SYMPTOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			situationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SITUATION_SECTION__SITUATION_SECTION_PRIMARY_SYMPTOM,
					EmspcrPlugin.INSTANCE.getString("SituationSectionPrimarySymptom"),
					new Object[] { situationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSituationSectionOtherSymptoms(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Other Symptoms</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionOtherSymptoms(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SITUATION_SECTION_OTHER_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::OtherSymptoms) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateSituationSectionOtherSymptoms(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Other Symptoms</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionOtherSymptoms(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SITUATION_SECTION_OTHER_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param situationSection The receiving '<em><b>Situation Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSituationSectionOtherSymptoms(SituationSection situationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SITUATION_SECTION_OTHER_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SITUATION_SECTION);
			try {
				VALIDATE_SITUATION_SECTION_OTHER_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SITUATION_SECTION_OTHER_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SITUATION_SECTION_OTHER_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			situationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SITUATION_SECTION__SITUATION_SECTION_OTHER_SYMPTOMS,
					EmspcrPlugin.INSTANCE.getString("SituationSectionOtherSymptoms"), new Object[] { situationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSituationSectionProviderSecondaryImpressions(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Provider Secondary Impressions</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionProviderSecondaryImpressions(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ProviderSecondaryImpressions) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateSituationSectionProviderSecondaryImpressions(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Provider Secondary Impressions</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionProviderSecondaryImpressions(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param situationSection The receiving '<em><b>Situation Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSituationSectionProviderSecondaryImpressions(SituationSection situationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SITUATION_SECTION);
			try {
				VALIDATE_SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			situationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SITUATION_SECTION__SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS,
					EmspcrPlugin.INSTANCE.getString("SituationSectionProviderSecondaryImpressions"),
					new Object[] { situationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSituationSectionInitialPatientAcuity(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Initial Patient Acuity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionInitialPatientAcuity(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SITUATION_SECTION_INITIAL_PATIENT_ACUITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::InitialPatientAcuity) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateSituationSectionInitialPatientAcuity(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Situation Section Initial Patient Acuity</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSituationSectionInitialPatientAcuity(SituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SITUATION_SECTION_INITIAL_PATIENT_ACUITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param situationSection The receiving '<em><b>Situation Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSituationSectionInitialPatientAcuity(SituationSection situationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SITUATION_SECTION_INITIAL_PATIENT_ACUITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SITUATION_SECTION);
			try {
				VALIDATE_SITUATION_SECTION_INITIAL_PATIENT_ACUITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SITUATION_SECTION_INITIAL_PATIENT_ACUITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SITUATION_SECTION_INITIAL_PATIENT_ACUITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			situationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SITUATION_SECTION__SITUATION_SECTION_INITIAL_PATIENT_ACUITY,
					EmspcrPlugin.INSTANCE.getString("SituationSectionInitialPatientAcuity"),
					new Object[] { situationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getComplaints(SituationSection) <em>Get Complaints</em>}' operation.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #getComplaints(SituationSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_COMPLAINTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::Complaint)).oclAsType(emspcr::Complaint)";

	/**
	 * The cached OCL query for the '{@link #getComplaints(SituationSection) <em>Get Complaints</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplaints(SituationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMPLAINTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Complaint> getComplaints(SituationSection situationSection) {
		if (GET_COMPLAINTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.SITUATION_SECTION,
				EmspcrPackage.Literals.SITUATION_SECTION.getEAllOperations().get(67));
			try {
				GET_COMPLAINTS__EOCL_QRY = helper.createQuery(GET_COMPLAINTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMPLAINTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Complaint> result = (Collection<Complaint>) query.evaluate(situationSection);
		return new BasicEList.UnmodifiableEList<Complaint>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPossibleInjury(SituationSection) <em>Get Possible Injury</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleInjury(SituationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_POSSIBLE_INJURY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PossibleInjury))->asSequence()->any(true).oclAsType(emspcr::PossibleInjury)";

	/**
	* The cached OCL query for the '{@link #getPossibleInjury(SituationSection) <em>Get Possible Injury</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPossibleInjury(SituationSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_POSSIBLE_INJURY__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static PossibleInjury getPossibleInjury(SituationSection situationSection) {
		if (GET_POSSIBLE_INJURY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.SITUATION_SECTION,
				EmspcrPackage.Literals.SITUATION_SECTION.getEAllOperations().get(68));
			try {
				GET_POSSIBLE_INJURY__EOCL_QRY = helper.createQuery(GET_POSSIBLE_INJURY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_POSSIBLE_INJURY__EOCL_QRY);
		return (PossibleInjury) query.evaluate(situationSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getProviderPrimaryImpression(SituationSection) <em>Get Provider Primary Impression</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProviderPrimaryImpression(SituationSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROVIDER_PRIMARY_IMPRESSION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ProviderPrimaryImpression))->asSequence()->any(true).oclAsType(emspcr::ProviderPrimaryImpression)";

	/**
	* The cached OCL query for the '{@link #getProviderPrimaryImpression(SituationSection) <em>Get Provider Primary Impression</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProviderPrimaryImpression(SituationSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROVIDER_PRIMARY_IMPRESSION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static ProviderPrimaryImpression getProviderPrimaryImpression(SituationSection situationSection) {
		if (GET_PROVIDER_PRIMARY_IMPRESSION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.SITUATION_SECTION,
				EmspcrPackage.Literals.SITUATION_SECTION.getEAllOperations().get(69));
			try {
				GET_PROVIDER_PRIMARY_IMPRESSION__EOCL_QRY = helper.createQuery(GET_PROVIDER_PRIMARY_IMPRESSION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROVIDER_PRIMARY_IMPRESSION__EOCL_QRY);
		return (ProviderPrimaryImpression) query.evaluate(situationSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getPrimarySymptom(SituationSection) <em>Get Primary Symptom</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPrimarySymptom(SituationSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_PRIMARY_SYMPTOM__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PrimarySymptom))->asSequence()->any(true).oclAsType(emspcr::PrimarySymptom)";

	/**
	* The cached OCL query for the '{@link #getPrimarySymptom(SituationSection) <em>Get Primary Symptom</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPrimarySymptom(SituationSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PRIMARY_SYMPTOM__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static PrimarySymptom getPrimarySymptom(SituationSection situationSection) {
		if (GET_PRIMARY_SYMPTOM__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.SITUATION_SECTION,
				EmspcrPackage.Literals.SITUATION_SECTION.getEAllOperations().get(70));
			try {
				GET_PRIMARY_SYMPTOM__EOCL_QRY = helper.createQuery(GET_PRIMARY_SYMPTOM__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRIMARY_SYMPTOM__EOCL_QRY);
		return (PrimarySymptom) query.evaluate(situationSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getOtherSymptoms(SituationSection) <em>Get Other Symptoms</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getOtherSymptoms(SituationSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_OTHER_SYMPTOMS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::OtherSymptoms))->asSequence()->any(true).oclAsType(emspcr::OtherSymptoms)";

	/**
	* The cached OCL query for the '{@link #getOtherSymptoms(SituationSection) <em>Get Other Symptoms</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getOtherSymptoms(SituationSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_OTHER_SYMPTOMS__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static OtherSymptoms getOtherSymptoms(SituationSection situationSection) {
		if (GET_OTHER_SYMPTOMS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.SITUATION_SECTION,
				EmspcrPackage.Literals.SITUATION_SECTION.getEAllOperations().get(71));
			try {
				GET_OTHER_SYMPTOMS__EOCL_QRY = helper.createQuery(GET_OTHER_SYMPTOMS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OTHER_SYMPTOMS__EOCL_QRY);
		return (OtherSymptoms) query.evaluate(situationSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getProviderSecondaryImpressions(SituationSection) <em>Get Provider Secondary Impressions</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProviderSecondaryImpressions(SituationSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROVIDER_SECONDARY_IMPRESSIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ProviderSecondaryImpressions))->asSequence()->any(true).oclAsType(emspcr::ProviderSecondaryImpressions)";

	/**
	* The cached OCL query for the '{@link #getProviderSecondaryImpressions(SituationSection) <em>Get Provider Secondary Impressions</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProviderSecondaryImpressions(SituationSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROVIDER_SECONDARY_IMPRESSIONS__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static ProviderSecondaryImpressions getProviderSecondaryImpressions(SituationSection situationSection) {
		if (GET_PROVIDER_SECONDARY_IMPRESSIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.SITUATION_SECTION,
				EmspcrPackage.Literals.SITUATION_SECTION.getEAllOperations().get(72));
			try {
				GET_PROVIDER_SECONDARY_IMPRESSIONS__EOCL_QRY = helper.createQuery(GET_PROVIDER_SECONDARY_IMPRESSIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROVIDER_SECONDARY_IMPRESSIONS__EOCL_QRY);
		return (ProviderSecondaryImpressions) query.evaluate(situationSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getInitialPatientAcuity(SituationSection) <em>Get Initial Patient Acuity</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getInitialPatientAcuity(SituationSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_INITIAL_PATIENT_ACUITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::InitialPatientAcuity))->asSequence()->any(true).oclAsType(emspcr::InitialPatientAcuity)";

	/**
	* The cached OCL query for the '{@link #getInitialPatientAcuity(SituationSection) <em>Get Initial Patient Acuity</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getInitialPatientAcuity(SituationSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_INITIAL_PATIENT_ACUITY__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static InitialPatientAcuity getInitialPatientAcuity(SituationSection situationSection) {
		if (GET_INITIAL_PATIENT_ACUITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.SITUATION_SECTION,
				EmspcrPackage.Literals.SITUATION_SECTION.getEAllOperations().get(73));
			try {
				GET_INITIAL_PATIENT_ACUITY__EOCL_QRY = helper.createQuery(GET_INITIAL_PATIENT_ACUITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INITIAL_PATIENT_ACUITY__EOCL_QRY);
		return (InitialPatientAcuity) query.evaluate(situationSection);
	}

} // SituationSectionOperations
