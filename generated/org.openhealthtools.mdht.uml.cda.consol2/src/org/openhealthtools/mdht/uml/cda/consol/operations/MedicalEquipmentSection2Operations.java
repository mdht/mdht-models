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
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical Equipment Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSection2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSection2MedicalEquipmentOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Medical Equipment Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSection2ProcedureActivityProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Procedure Activity Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#getConsolNonMedicinalSupplyActivity2s() <em>Get Consol Non Medicinal Supply Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#getMedicalEquipmentOrganizers() <em>Get Medical Equipment Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#getProcedureActivityProcedure2s() <em>Get Procedure Activity Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2#validateMedicalEquipmentSectionNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Non Medicinal Supply Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicalEquipmentSection2Operations extends MedicalEquipmentSectionOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicalEquipmentSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSection2TemplateId(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2TemplateId(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.23' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSection2TemplateId(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2TemplateId(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICAL_EQUIPMENT_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalEquipmentSection2 The receiving '<em><b>Medical Equipment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicalEquipmentSection2TemplateId(MedicalEquipmentSection2 medicalEquipmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "MedicalEquipmentSection2MedicalEquipmentSection2TemplateId", "ERROR");

		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICAL_EQUIPMENT_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICAL_EQUIPMENT_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicalEquipmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICAL_EQUIPMENT_SECTION2__MEDICAL_EQUIPMENT_SECTION2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("MedicalEquipmentSection2MedicalEquipmentSection2TemplateId"),
						new Object[] { medicalEquipmentSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSection2MedicalEquipmentOrganizer(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Medical Equipment Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2MedicalEquipmentOrganizer(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION2_MEDICAL_EQUIPMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::MedicalEquipmentOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSection2MedicalEquipmentOrganizer(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Medical Equipment Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2MedicalEquipmentOrganizer(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICAL_EQUIPMENT_SECTION2_MEDICAL_EQUIPMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalEquipmentSection2 The receiving '<em><b>Medical Equipment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicalEquipmentSection2MedicalEquipmentOrganizer(
			MedicalEquipmentSection2 medicalEquipmentSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "MedicalEquipmentSection2MedicalEquipmentSection2MedicalEquipmentOrganizer", "INFO");

		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION2_MEDICAL_EQUIPMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION2_MEDICAL_EQUIPMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICAL_EQUIPMENT_SECTION2_MEDICAL_EQUIPMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICAL_EQUIPMENT_SECTION2_MEDICAL_EQUIPMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicalEquipmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICAL_EQUIPMENT_SECTION2__MEDICAL_EQUIPMENT_SECTION2_MEDICAL_EQUIPMENT_ORGANIZER,
						ConsolPlugin.INSTANCE.getString(
							"MedicalEquipmentSection2MedicalEquipmentSection2MedicalEquipmentOrganizer"),
						new Object[] { medicalEquipmentSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSection2ProcedureActivityProcedure2(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Procedure Activity Procedure2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2ProcedureActivityProcedure2(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(consol::ProcedureActivityProcedure2))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSection2ProcedureActivityProcedure2(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section2 Procedure Activity Procedure2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSection2ProcedureActivityProcedure2(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICAL_EQUIPMENT_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalEquipmentSection2 The receiving '<em><b>Medical Equipment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicalEquipmentSection2ProcedureActivityProcedure2(
			MedicalEquipmentSection2 medicalEquipmentSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "MedicalEquipmentSection2MedicalEquipmentSection2ProcedureActivityProcedure2", "WARNING");

		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICAL_EQUIPMENT_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICAL_EQUIPMENT_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicalEquipmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICAL_EQUIPMENT_SECTION2__MEDICAL_EQUIPMENT_SECTION2_PROCEDURE_ACTIVITY_PROCEDURE2,
						ConsolPlugin.INSTANCE.getString(
							"MedicalEquipmentSection2MedicalEquipmentSection2ProcedureActivityProcedure2"),
						new Object[] { medicalEquipmentSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolNonMedicinalSupplyActivity2s(MedicalEquipmentSection2) <em>Get Consol Non Medicinal Supply Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolNonMedicinalSupplyActivity2s(MedicalEquipmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2)).oclAsType(consol::NonMedicinalSupplyActivity2)";

	/**
	 * The cached OCL query for the '{@link #getConsolNonMedicinalSupplyActivity2s(MedicalEquipmentSection2) <em>Get Consol Non Medicinal Supply Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolNonMedicinalSupplyActivity2s(MedicalEquipmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NonMedicinalSupplyActivity2> getConsolNonMedicinalSupplyActivity2s(
			MedicalEquipmentSection2 medicalEquipmentSection2) {

		if (GET_CONSOL_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2,
				ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2.getEAllOperations().get(65));
			try {
				GET_CONSOL_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NonMedicinalSupplyActivity2> result = (Collection<NonMedicinalSupplyActivity2>) query.evaluate(
			medicalEquipmentSection2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicalEquipmentOrganizers(MedicalEquipmentSection2) <em>Get Medical Equipment Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentOrganizers(MedicalEquipmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICAL_EQUIPMENT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::MedicalEquipmentOrganizer)).oclAsType(consol::MedicalEquipmentOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getMedicalEquipmentOrganizers(MedicalEquipmentSection2) <em>Get Medical Equipment Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentOrganizers(MedicalEquipmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICAL_EQUIPMENT_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MedicalEquipmentOrganizer> getMedicalEquipmentOrganizers(
			MedicalEquipmentSection2 medicalEquipmentSection2) {

		if (GET_MEDICAL_EQUIPMENT_ORGANIZERS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2,
				ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2.getEAllOperations().get(66));
			try {
				GET_MEDICAL_EQUIPMENT_ORGANIZERS__EOCL_QRY = helper.createQuery(
					GET_MEDICAL_EQUIPMENT_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MEDICAL_EQUIPMENT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicalEquipmentOrganizer> result = (Collection<MedicalEquipmentOrganizer>) query.evaluate(
			medicalEquipmentSection2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getProcedureActivityProcedure2s(MedicalEquipmentSection2) <em>Get Procedure Activity Procedure2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityProcedure2s(MedicalEquipmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2)).oclAsType(consol::ProcedureActivityProcedure2)";

	/**
	 * The cached OCL query for the '{@link #getProcedureActivityProcedure2s(MedicalEquipmentSection2) <em>Get Procedure Activity Procedure2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureActivityProcedure2s(MedicalEquipmentSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProcedureActivityProcedure2> getProcedureActivityProcedure2s(
			MedicalEquipmentSection2 medicalEquipmentSection2) {

		if (GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2,
				ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2.getEAllOperations().get(67));
			try {
				GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY = helper.createQuery(
					GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROCEDURE_ACTIVITY_PROCEDURE2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProcedureActivityProcedure2> result = (Collection<ProcedureActivityProcedure2>) query.evaluate(
			medicalEquipmentSection2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionCodeP(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionCodeP(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionCodeP(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionCodeP(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalEquipmentSection2 The receiving '<em><b>Medical Equipment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicalEquipmentSectionCodeP(MedicalEquipmentSection2 medicalEquipmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "MedicalEquipmentSection2MedicalEquipmentSectionCodeP", "ERROR");

		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicalEquipmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICAL_EQUIPMENT_SECTION2__MEDICAL_EQUIPMENT_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("MedicalEquipmentSection2MedicalEquipmentSectionCodeP"),
						new Object[] { medicalEquipmentSection2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSectionCodeP", passToken);
				}
				passToken.add(medicalEquipmentSection2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionCode(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionCode(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '46264-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionCode(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionCode(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalEquipmentSection2 The receiving '<em><b>Medical Equipment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicalEquipmentSectionCode(MedicalEquipmentSection2 medicalEquipmentSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicalEquipmentSection2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "MedicalEquipmentSection2MedicalEquipmentSectionCode", "ERROR");

		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicalEquipmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICAL_EQUIPMENT_SECTION2__MEDICAL_EQUIPMENT_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString("MedicalEquipmentSection2MedicalEquipmentSectionCode"),
						new Object[] { medicalEquipmentSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicalEquipmentSectionNonMedicinalSupplyActivity(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Non Medicinal Supply Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionNonMedicinalSupplyActivity(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.supply.oclIsUndefined() and entry.supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicalEquipmentSectionNonMedicinalSupplyActivity(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Non Medicinal Supply Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicalEquipmentSectionNonMedicinalSupplyActivity(MedicalEquipmentSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param medicalEquipmentSection2 The receiving '<em><b>Medical Equipment Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMedicalEquipmentSectionNonMedicinalSupplyActivity(
			MedicalEquipmentSection2 medicalEquipmentSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "MedicalEquipmentSection2MedicalEquipmentSectionNonMedicinalSupplyActivity", "WARNING");

		if (VALIDATE_MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MEDICAL_EQUIPMENT_SECTION2);
			try {
				VALIDATE_MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				medicalEquipmentSection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MEDICAL_EQUIPMENT_SECTION2__MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY,
						ConsolPlugin.INSTANCE.getString(
							"MedicalEquipmentSection2MedicalEquipmentSectionNonMedicinalSupplyActivity"),
						new Object[] { medicalEquipmentSection2 }));
			}

			return false;
		}
		return true;
	}

} // MedicalEquipmentSection2Operations
