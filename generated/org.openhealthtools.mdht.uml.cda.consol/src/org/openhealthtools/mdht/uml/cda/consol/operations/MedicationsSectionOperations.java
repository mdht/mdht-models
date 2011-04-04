/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Medication;
import org.openhealthtools.mdht.uml.cda.consol.MedicationOrderInformation;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medications Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection#validateMedicationsSectionHasMedicationOrSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Has Medication Or Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection#validateMedicationsSectionMedicationOrderInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Medication Order Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection#getSupplyActivities() <em>Get Supply Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection#getMedications() <em>Get Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection#validateMedicationsNarrativeSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Narrative Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationsSectionOperations extends MedicationsNarrativeSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationsSectionHasMedicationOrSupplyActivity(MedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Has Medication Or Supply Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsSectionHasMedicationOrSupplyActivity(MedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSubstanceAdministrations()->exists(activity : cda::SubstanceAdministration | activity.oclIsKindOf(ccd::MedicationActivity))"+
"   or self.getSupplies()->exists(activity : cda::Supply | activity.oclIsKindOf(ccd::SupplyActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationsSectionHasMedicationOrSupplyActivity(MedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Has Medication Or Supply Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsSectionHasMedicationOrSupplyActivity(MedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->exists(activity : cda::SubstanceAdministration | activity.oclIsKindOf(ccd::MedicationActivity))
	 *    or self.getSupplies()->exists(activity : cda::Supply | activity.oclIsKindOf(ccd::SupplyActivity))
	 * @param medicationsSection The receiving '<em><b>Medications Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationsSectionHasMedicationOrSupplyActivity(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATIONS_SECTION);
			try {
				VALIDATE_MEDICATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATIONS_SECTION__MEDICATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY,
						 ConsolPlugin.INSTANCE.getString("MedicationsSectionHasMedicationOrSupplyActivity"),
						 new Object [] { medicationsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationsSectionMedicationOrderInformation(MedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Medication Order Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsSectionMedicationOrderInformation(MedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATIONS_SECTION_MEDICATION_ORDER_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.supply.oclIsUndefined() and entry.supply.oclIsKindOf(consol::MedicationOrderInformation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationsSectionMedicationOrderInformation(MedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Medication Order Information</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsSectionMedicationOrderInformation(MedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATIONS_SECTION_MEDICATION_ORDER_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.supply.oclIsUndefined() and entry.supply.oclIsKindOf(consol::MedicationOrderInformation))
	 * @param medicationsSection The receiving '<em><b>Medications Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationsSectionMedicationOrderInformation(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATIONS_SECTION_MEDICATION_ORDER_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATIONS_SECTION);
			try {
				VALIDATE_MEDICATIONS_SECTION_MEDICATION_ORDER_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATIONS_SECTION_MEDICATION_ORDER_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATIONS_SECTION_MEDICATION_ORDER_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATIONS_SECTION__MEDICATIONS_SECTION_MEDICATION_ORDER_INFORMATION,
						 ConsolPlugin.INSTANCE.getString("MedicationsSectionMedicationOrderInformation"),
						 new Object [] { medicationsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplyActivities(MedicationsSection) <em>Get Supply Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyActivities(MedicationsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLY_ACTIVITIES__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationOrderInformation)).oclAsType(consol::MedicationOrderInformation)";

	/**
	 * The cached OCL query for the '{@link #getSupplyActivities(MedicationsSection) <em>Get Supply Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyActivities(MedicationsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLY_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::MedicationOrderInformation)).oclAsType(consol::MedicationOrderInformation)
	 * @param medicationsSection The receiving '<em><b>Medications Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<MedicationOrderInformation> getSupplyActivities(MedicationsSection medicationsSection) {
		if (GET_SUPPLY_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.MEDICATIONS_SECTION, ConsolPackage.Literals.MEDICATIONS_SECTION.getEAllOperations().get(61));
			try {
				GET_SUPPLY_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_SUPPLY_ACTIVITIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLY_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationOrderInformation> result = (Collection<MedicationOrderInformation>) query.evaluate(medicationsSection);
		return new BasicEList.UnmodifiableEList<MedicationOrderInformation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedications(MedicationsSection) <em>Get Medications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedications(MedicationsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::Medication)).oclAsType(consol::Medication)";

	/**
	 * The cached OCL query for the '{@link #getMedications(MedicationsSection) <em>Get Medications</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedications(MedicationsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::Medication)).oclAsType(consol::Medication)
	 * @param medicationsSection The receiving '<em><b>Medications Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<Medication> getMedications(MedicationsSection medicationsSection) {
		if (GET_MEDICATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.MEDICATIONS_SECTION, ConsolPackage.Literals.MEDICATIONS_SECTION.getEAllOperations().get(62));
			try {
				GET_MEDICATIONS__EOCL_QRY = helper.createQuery(GET_MEDICATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Medication> result = (Collection<Medication>) query.evaluate(medicationsSection);
		return new BasicEList.UnmodifiableEList<Medication>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationsNarrativeSectionTemplateId(MedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Narrative Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsNarrativeSectionTemplateId(MedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.2.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationsNarrativeSectionTemplateId(MedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Narrative Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationsNarrativeSectionTemplateId(MedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.2.1.1')
	 * @param medicationsSection The receiving '<em><b>Medications Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationsNarrativeSectionTemplateId(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICATIONS_SECTION);
			try {
				VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICATIONS_SECTION__MEDICATIONS_NARRATIVE_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicationsNarrativeSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationsSection, context) }),
						 new Object [] { medicationsSection }));
			}
			return false;
		}
		return true;
	}

} // MedicationsSectionOperations