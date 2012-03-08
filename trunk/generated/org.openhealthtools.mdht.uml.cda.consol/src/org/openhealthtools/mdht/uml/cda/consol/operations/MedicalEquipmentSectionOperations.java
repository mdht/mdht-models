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
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical Equipment Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection#validateMedicalEquipmentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection#validateMedicalEquipmentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection#validateMedicalEquipmentSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection#validateMedicalEquipmentSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection#validateMedicalEquipmentSectionNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection#getNonMedicinalSupplyActivities() <em>Get Non Medicinal Supply Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicalEquipmentSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicalEquipmentSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.23')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.23')
	 * @param medicalEquipmentSection The receiving '<em><b>Medical Equipment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection medicalEquipmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("MedicalEquipmentSectionTemplateId"),
						 new Object [] { medicalEquipmentSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionCode(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionCode(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '46264-8' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionCode(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionCode(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '46264-8' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param medicalEquipmentSection The receiving '<em><b>Medical Equipment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicalEquipmentSectionCode(MedicalEquipmentSection medicalEquipmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_CODE,
						 ConsolPlugin.INSTANCE.getString("MedicalEquipmentSectionCode"),
						 new Object [] { medicalEquipmentSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionTitle(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionTitle(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionTitle(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionTitle(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param medicalEquipmentSection The receiving '<em><b>Medical Equipment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicalEquipmentSectionTitle(MedicalEquipmentSection medicalEquipmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_TITLE,
						 ConsolPlugin.INSTANCE.getString("MedicalEquipmentSectionTitle"),
						 new Object [] { medicalEquipmentSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionText(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionText(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionText(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionText(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param medicalEquipmentSection The receiving '<em><b>Medical Equipment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicalEquipmentSectionText(MedicalEquipmentSection medicalEquipmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_TEXT,
						 ConsolPlugin.INSTANCE.getString("MedicalEquipmentSectionText"),
						 new Object [] { medicalEquipmentSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionNonMedicinalSupplyActivity(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Non Medicinal Supply Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionNonMedicinalSupplyActivity(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.supply.oclIsUndefined() and entry.supply.oclIsKindOf(consol::NonMedicinalSupplyActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionNonMedicinalSupplyActivity(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Non Medicinal Supply Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionNonMedicinalSupplyActivity(MedicalEquipmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.supply.oclIsUndefined() and entry.supply.oclIsKindOf(consol::NonMedicinalSupplyActivity))
	 * @param medicalEquipmentSection The receiving '<em><b>Medical Equipment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMedicalEquipmentSectionNonMedicinalSupplyActivity(
			MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicalEquipmentSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY,
						 ConsolPlugin.INSTANCE.getString("MedicalEquipmentSectionNonMedicinalSupplyActivity"),
						 new Object [] { medicalEquipmentSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonMedicinalSupplyActivities(MedicalEquipmentSection) <em>Get Non Medicinal Supply Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMedicinalSupplyActivities(MedicalEquipmentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity)).oclAsType(consol::NonMedicinalSupplyActivity)";

	/**
	 * The cached OCL query for the '{@link #getNonMedicinalSupplyActivities(MedicalEquipmentSection) <em>Get Non Medicinal Supply Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonMedicinalSupplyActivities(MedicalEquipmentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity)).oclAsType(consol::NonMedicinalSupplyActivity)
	 * @param medicalEquipmentSection The receiving '<em><b>Medical Equipment Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<NonMedicinalSupplyActivity> getNonMedicinalSupplyActivities(
			MedicalEquipmentSection medicalEquipmentSection) {
		if (GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION, ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION.getEAllOperations().get(60));
			try {
				GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_MEDICINAL_SUPPLY_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NonMedicinalSupplyActivity> result = (Collection<NonMedicinalSupplyActivity>) query.evaluate(medicalEquipmentSection);
		return new BasicEList.UnmodifiableEList<NonMedicinalSupplyActivity>(result.size(), result.toArray());
	}

} // MedicalEquipmentSectionOperations
