/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

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

import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Medications Administered Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection#validateMu2consolMedicationsAdministeredSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Medications Administered Section Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection#getMu2consolMedicationActivities() <em>Get Mu2consol Medication Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection#validateMedicationsAdministeredSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationsAdministeredSectionOperations
		extends
		org.openhealthtools.mdht.uml.cda.consol.operations.MedicationsAdministeredSectionOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationsAdministeredSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMu2consolMedicationsAdministeredSectionMedicationActivity(MedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Medications Administered Section Medication Activity</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolMedicationsAdministeredSectionMedicationActivity(MedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::MedicationActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateMu2consolMedicationsAdministeredSectionMedicationActivity(MedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Medications Administered Section Medication Activity</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMu2consolMedicationsAdministeredSectionMedicationActivity(MedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not
	 * entry.substanceAdministration.oclIsUndefined() and
	 * entry.substanceAdministration.oclIsKindOf(consol::MedicationActivity))
	 * 
	 * @param medicationsAdministeredSection
	 *            The receiving '
	 *            <em><b>Medications Administered Section</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateMu2consolMedicationsAdministeredSectionMedicationActivity(
			MedicationsAdministeredSection medicationsAdministeredSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.MEDICATIONS_ADMINISTERED_SECTION);
			try {
				VALIDATE_MU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationsAdministeredSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.MEDICATIONS_ADMINISTERED_SECTION__MU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY,
						 Mu2consolPlugin.INSTANCE.getString("Mu2consolMedicationsAdministeredSectionMedicationActivity"),
						 new Object [] { medicationsAdministeredSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMu2consolMedicationActivities(MedicationsAdministeredSection) <em>Get Mu2consol Medication Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolMedicationActivities(MedicationsAdministeredSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_MEDICATION_ACTIVITIES__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity)).oclAsType(consol::MedicationActivity)";

	/**
	 * The cached OCL query for the '{@link #getMu2consolMedicationActivities(MedicationsAdministeredSection) <em>Get Mu2consol Medication Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu2consolMedicationActivities(MedicationsAdministeredSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_MEDICATION_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::MedicationActivity)).oclAsType(consol::MedicationActivity)
	 * @param medicationsAdministeredSection The receiving '<em><b>Medications Administered Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<MedicationActivity> getMu2consolMedicationActivities(MedicationsAdministeredSection medicationsAdministeredSection) {
		if (GET_MU2CONSOL_MEDICATION_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.MEDICATIONS_ADMINISTERED_SECTION, Mu2consolPackage.Literals.MEDICATIONS_ADMINISTERED_SECTION.getEAllOperations().get(63));
			try {
				GET_MU2CONSOL_MEDICATION_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_MU2CONSOL_MEDICATION_ACTIVITIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MU2CONSOL_MEDICATION_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationActivity> result = (Collection<MedicationActivity>) query.evaluate(medicationsAdministeredSection);
		return new BasicEList.UnmodifiableEList<MedicationActivity>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationsAdministeredSectionTemplateId(MedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Template Id</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMedicationsAdministeredSectionTemplateId(MedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.38')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationsAdministeredSectionTemplateId(MedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMedicationsAdministeredSectionTemplateId(MedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.20.22.2.38')
	 * 
	 * @param medicationsAdministeredSection
	 *            The receiving '
	 *            <em><b>Medications Administered Section</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateMedicationsAdministeredSectionTemplateId(
			MedicationsAdministeredSection medicationsAdministeredSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.MEDICATIONS_ADMINISTERED_SECTION);
			try {
				VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationsAdministeredSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.MEDICATIONS_ADMINISTERED_SECTION__MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicationsAdministeredSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationsAdministeredSection, context) }),
						 new Object [] { medicationsAdministeredSection }));
			}
			 
			return false;
		}
		return true;
	}

} // MedicationsAdministeredSectionOperations