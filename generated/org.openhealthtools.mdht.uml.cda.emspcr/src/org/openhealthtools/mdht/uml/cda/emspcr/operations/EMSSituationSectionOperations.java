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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.InitialPatientAcuity;
import org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms;
import org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury;
import org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom;
import org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression;
import org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Situation Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Complaint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionPossibleInjury(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Possible Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionProviderPrimaryImpression(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Provider Primary Impression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionPrimarySymptom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Primary Symptom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionOtherSymptoms(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Other Symptoms</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionProviderSecondaryImpressions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Provider Secondary Impressions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionInitialPatientAcuity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Initial Patient Acuity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getComplaints() <em>Get Complaints</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getPossibleInjury() <em>Get Possible Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getProviderPrimaryImpression() <em>Get Provider Primary Impression</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getPrimarySymptom() <em>Get Primary Symptom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getOtherSymptoms() <em>Get Other Symptoms</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getProviderSecondaryImpressions() <em>Get Provider Secondary Impressions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#getInitialPatientAcuity() <em>Get Initial Patient Acuity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSSituationSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSSituationSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSituationSectionTemplateId(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionTemplateId(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.9')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSituationSectionTemplateId(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionTemplateId(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSituationSectionTemplateId(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
			try {
				VALIDATE_EMS_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSituationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("EMSSituationSectionTemplateId"),
					new Object[] { emsSituationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSituationSectionCode(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionCode(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67666-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSituationSectionCode(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionCode(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSituationSectionCode(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
			try {
				VALIDATE_EMS_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSituationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSSituationSectionCode"), new Object[] { emsSituationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSituationSectionCodeP(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionCodeP(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSituationSectionCodeP(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionCodeP(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSituationSectionCodeP(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
			try {
				VALIDATE_EMS_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSituationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("EMSSituationSectionCodeP"), new Object[] { emsSituationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSituationSectionTitle(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionTitle(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Situation Section')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSituationSectionTitle(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionTitle(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSituationSectionTitle(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
			try {
				VALIDATE_EMS_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSituationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("EMSSituationSectionTitle"), new Object[] { emsSituationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSituationSectionText(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionText(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSituationSectionText(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionText(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSituationSectionText(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
			try {
				VALIDATE_EMS_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSituationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("EMSSituationSectionText"), new Object[] { emsSituationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSituationSectionComplaint(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Complaint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionComplaint(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::Complaint) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSituationSectionComplaint(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Complaint</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionComplaint(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSituationSectionComplaint(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SITUATION_SECTION_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
			try {
				VALIDATE_EMS_SITUATION_SECTION_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSituationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_COMPLAINT,
					EmspcrPlugin.INSTANCE.getString("EMSSituationSectionComplaint"),
					new Object[] { emsSituationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSituationSectionPossibleInjury(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Possible Injury</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionPossibleInjury(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_POSSIBLE_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PossibleInjury) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSituationSectionPossibleInjury(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Possible Injury</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionPossibleInjury(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_POSSIBLE_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSituationSectionPossibleInjury(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SITUATION_SECTION_POSSIBLE_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
			try {
				VALIDATE_EMS_SITUATION_SECTION_POSSIBLE_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_POSSIBLE_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_POSSIBLE_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSituationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_POSSIBLE_INJURY,
					EmspcrPlugin.INSTANCE.getString("EMSSituationSectionPossibleInjury"),
					new Object[] { emsSituationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSituationSectionProviderPrimaryImpression(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Provider Primary Impression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionProviderPrimaryImpression(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ProviderPrimaryImpression) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSituationSectionProviderPrimaryImpression(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Provider Primary Impression</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionProviderPrimaryImpression(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSituationSectionProviderPrimaryImpression(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
			try {
				VALIDATE_EMS_SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSituationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_PROVIDER_PRIMARY_IMPRESSION,
					EmspcrPlugin.INSTANCE.getString("EMSSituationSectionProviderPrimaryImpression"),
					new Object[] { emsSituationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSituationSectionPrimarySymptom(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Primary Symptom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionPrimarySymptom(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_PRIMARY_SYMPTOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PrimarySymptom) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSituationSectionPrimarySymptom(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Primary Symptom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionPrimarySymptom(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_PRIMARY_SYMPTOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSituationSectionPrimarySymptom(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SITUATION_SECTION_PRIMARY_SYMPTOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
			try {
				VALIDATE_EMS_SITUATION_SECTION_PRIMARY_SYMPTOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_PRIMARY_SYMPTOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_PRIMARY_SYMPTOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSituationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_PRIMARY_SYMPTOM,
					EmspcrPlugin.INSTANCE.getString("EMSSituationSectionPrimarySymptom"),
					new Object[] { emsSituationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSituationSectionOtherSymptoms(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Other Symptoms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionOtherSymptoms(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_OTHER_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::OtherSymptoms) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSituationSectionOtherSymptoms(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Other Symptoms</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionOtherSymptoms(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_OTHER_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSituationSectionOtherSymptoms(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SITUATION_SECTION_OTHER_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
			try {
				VALIDATE_EMS_SITUATION_SECTION_OTHER_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_OTHER_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_OTHER_SYMPTOMS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSituationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_OTHER_SYMPTOMS,
					EmspcrPlugin.INSTANCE.getString("EMSSituationSectionOtherSymptoms"),
					new Object[] { emsSituationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSituationSectionProviderSecondaryImpressions(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Provider Secondary Impressions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionProviderSecondaryImpressions(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ProviderSecondaryImpressions) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSituationSectionProviderSecondaryImpressions(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Provider Secondary Impressions</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionProviderSecondaryImpressions(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSituationSectionProviderSecondaryImpressions(
			EMSSituationSection emsSituationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
			try {
				VALIDATE_EMS_SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSituationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_PROVIDER_SECONDARY_IMPRESSIONS,
					EmspcrPlugin.INSTANCE.getString("EMSSituationSectionProviderSecondaryImpressions"),
					new Object[] { emsSituationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSSituationSectionInitialPatientAcuity(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Initial Patient Acuity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionInitialPatientAcuity(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_SITUATION_SECTION_INITIAL_PATIENT_ACUITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::InitialPatientAcuity) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSSituationSectionInitialPatientAcuity(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Initial Patient Acuity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSSituationSectionInitialPatientAcuity(EMSSituationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_SITUATION_SECTION_INITIAL_PATIENT_ACUITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsSituationSection The receiving '<em><b>EMS Situation Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSSituationSectionInitialPatientAcuity(EMSSituationSection emsSituationSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMS_SITUATION_SECTION_INITIAL_PATIENT_ACUITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_SITUATION_SECTION);
			try {
				VALIDATE_EMS_SITUATION_SECTION_INITIAL_PATIENT_ACUITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_SITUATION_SECTION_INITIAL_PATIENT_ACUITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_SITUATION_SECTION_INITIAL_PATIENT_ACUITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsSituationSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_SITUATION_SECTION__EMS_SITUATION_SECTION_INITIAL_PATIENT_ACUITY,
					EmspcrPlugin.INSTANCE.getString("EMSSituationSectionInitialPatientAcuity"),
					new Object[] { emsSituationSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getComplaints(EMSSituationSection) <em>Get Complaints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplaints(EMSSituationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMPLAINTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::Complaint)).oclAsType(emspcr::Complaint)";

	/**
	 * The cached OCL query for the '{@link #getComplaints(EMSSituationSection) <em>Get Complaints</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplaints(EMSSituationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMPLAINTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<Complaint> getComplaints(EMSSituationSection emsSituationSection) {
		if (GET_COMPLAINTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_SITUATION_SECTION,
				EmspcrPackage.Literals.EMS_SITUATION_SECTION.getEAllOperations().get(67));
			try {
				GET_COMPLAINTS__EOCL_QRY = helper.createQuery(GET_COMPLAINTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMPLAINTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Complaint> result = (Collection<Complaint>) query.evaluate(emsSituationSection);
		return new BasicEList.UnmodifiableEList<Complaint>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPossibleInjury(EMSSituationSection) <em>Get Possible Injury</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleInjury(EMSSituationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_POSSIBLE_INJURY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PossibleInjury))->asSequence()->any(true).oclAsType(emspcr::PossibleInjury)";

	/**
	 * The cached OCL query for the '{@link #getPossibleInjury(EMSSituationSection) <em>Get Possible Injury</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleInjury(EMSSituationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_POSSIBLE_INJURY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PossibleInjury getPossibleInjury(EMSSituationSection emsSituationSection) {
		if (GET_POSSIBLE_INJURY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_SITUATION_SECTION,
				EmspcrPackage.Literals.EMS_SITUATION_SECTION.getEAllOperations().get(68));
			try {
				GET_POSSIBLE_INJURY__EOCL_QRY = helper.createQuery(GET_POSSIBLE_INJURY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_POSSIBLE_INJURY__EOCL_QRY);
		return (PossibleInjury) query.evaluate(emsSituationSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProviderPrimaryImpression(EMSSituationSection) <em>Get Provider Primary Impression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderPrimaryImpression(EMSSituationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROVIDER_PRIMARY_IMPRESSION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ProviderPrimaryImpression))->asSequence()->any(true).oclAsType(emspcr::ProviderPrimaryImpression)";

	/**
	 * The cached OCL query for the '{@link #getProviderPrimaryImpression(EMSSituationSection) <em>Get Provider Primary Impression</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderPrimaryImpression(EMSSituationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROVIDER_PRIMARY_IMPRESSION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProviderPrimaryImpression getProviderPrimaryImpression(EMSSituationSection emsSituationSection) {
		if (GET_PROVIDER_PRIMARY_IMPRESSION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_SITUATION_SECTION,
				EmspcrPackage.Literals.EMS_SITUATION_SECTION.getEAllOperations().get(69));
			try {
				GET_PROVIDER_PRIMARY_IMPRESSION__EOCL_QRY = helper.createQuery(GET_PROVIDER_PRIMARY_IMPRESSION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROVIDER_PRIMARY_IMPRESSION__EOCL_QRY);
		return (ProviderPrimaryImpression) query.evaluate(emsSituationSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPrimarySymptom(EMSSituationSection) <em>Get Primary Symptom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimarySymptom(EMSSituationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRIMARY_SYMPTOM__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PrimarySymptom))->asSequence()->any(true).oclAsType(emspcr::PrimarySymptom)";

	/**
	 * The cached OCL query for the '{@link #getPrimarySymptom(EMSSituationSection) <em>Get Primary Symptom</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimarySymptom(EMSSituationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRIMARY_SYMPTOM__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PrimarySymptom getPrimarySymptom(EMSSituationSection emsSituationSection) {
		if (GET_PRIMARY_SYMPTOM__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_SITUATION_SECTION,
				EmspcrPackage.Literals.EMS_SITUATION_SECTION.getEAllOperations().get(70));
			try {
				GET_PRIMARY_SYMPTOM__EOCL_QRY = helper.createQuery(GET_PRIMARY_SYMPTOM__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRIMARY_SYMPTOM__EOCL_QRY);
		return (PrimarySymptom) query.evaluate(emsSituationSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getOtherSymptoms(EMSSituationSection) <em>Get Other Symptoms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSymptoms(EMSSituationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OTHER_SYMPTOMS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::OtherSymptoms))->asSequence()->any(true).oclAsType(emspcr::OtherSymptoms)";

	/**
	 * The cached OCL query for the '{@link #getOtherSymptoms(EMSSituationSection) <em>Get Other Symptoms</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSymptoms(EMSSituationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OTHER_SYMPTOMS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static OtherSymptoms getOtherSymptoms(EMSSituationSection emsSituationSection) {
		if (GET_OTHER_SYMPTOMS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_SITUATION_SECTION,
				EmspcrPackage.Literals.EMS_SITUATION_SECTION.getEAllOperations().get(71));
			try {
				GET_OTHER_SYMPTOMS__EOCL_QRY = helper.createQuery(GET_OTHER_SYMPTOMS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OTHER_SYMPTOMS__EOCL_QRY);
		return (OtherSymptoms) query.evaluate(emsSituationSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProviderSecondaryImpressions(EMSSituationSection) <em>Get Provider Secondary Impressions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderSecondaryImpressions(EMSSituationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROVIDER_SECONDARY_IMPRESSIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ProviderSecondaryImpressions))->asSequence()->any(true).oclAsType(emspcr::ProviderSecondaryImpressions)";

	/**
	 * The cached OCL query for the '{@link #getProviderSecondaryImpressions(EMSSituationSection) <em>Get Provider Secondary Impressions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderSecondaryImpressions(EMSSituationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROVIDER_SECONDARY_IMPRESSIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProviderSecondaryImpressions getProviderSecondaryImpressions(EMSSituationSection emsSituationSection) {
		if (GET_PROVIDER_SECONDARY_IMPRESSIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_SITUATION_SECTION,
				EmspcrPackage.Literals.EMS_SITUATION_SECTION.getEAllOperations().get(72));
			try {
				GET_PROVIDER_SECONDARY_IMPRESSIONS__EOCL_QRY = helper.createQuery(GET_PROVIDER_SECONDARY_IMPRESSIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROVIDER_SECONDARY_IMPRESSIONS__EOCL_QRY);
		return (ProviderSecondaryImpressions) query.evaluate(emsSituationSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInitialPatientAcuity(EMSSituationSection) <em>Get Initial Patient Acuity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPatientAcuity(EMSSituationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INITIAL_PATIENT_ACUITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::InitialPatientAcuity))->asSequence()->any(true).oclAsType(emspcr::InitialPatientAcuity)";

	/**
	 * The cached OCL query for the '{@link #getInitialPatientAcuity(EMSSituationSection) <em>Get Initial Patient Acuity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPatientAcuity(EMSSituationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INITIAL_PATIENT_ACUITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static InitialPatientAcuity getInitialPatientAcuity(EMSSituationSection emsSituationSection) {
		if (GET_INITIAL_PATIENT_ACUITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_SITUATION_SECTION,
				EmspcrPackage.Literals.EMS_SITUATION_SECTION.getEAllOperations().get(73));
			try {
				GET_INITIAL_PATIENT_ACUITY__EOCL_QRY = helper.createQuery(GET_INITIAL_PATIENT_ACUITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INITIAL_PATIENT_ACUITY__EOCL_QRY);
		return (InitialPatientAcuity) query.evaluate(emsSituationSection);
	}

} // EMSSituationSectionOperations
