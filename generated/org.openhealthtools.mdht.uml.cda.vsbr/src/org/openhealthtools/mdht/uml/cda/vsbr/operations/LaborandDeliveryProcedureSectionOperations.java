/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

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

import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection;
import org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Laborand Delivery Procedure Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionObstetricProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Obstetric Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#validateLaborandDeliveryProcedureSectionMethodOfDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Method Of Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#getObstetricProcedures() <em>Get Obstetric Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection#getMethodOfDelivery() <em>Get Method Of Delivery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaborandDeliveryProcedureSectionOperations extends org.eclipse.mdht.uml.cda.operations.SectionOperations {
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
	protected LaborandDeliveryProcedureSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcedureSectionTemplateId(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionTemplateId(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcedureSectionTemplateId(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionTemplateId(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcedureSection The receiving '<em><b>Laborand Delivery Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcedureSectionTemplateId(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCEDURE_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcedureSectionLaborandDeliveryProcedureSectionTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcedureSection, context) }),
						new Object[] { laborandDeliveryProcedureSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcedureSectionClassCode(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionClassCode(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcedureSectionClassCode(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionClassCode(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcedureSection The receiving '<em><b>Laborand Delivery Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcedureSectionClassCode(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCEDURE_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcedureSectionLaborandDeliveryProcedureSectionClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcedureSection, context) }),
						new Object[] { laborandDeliveryProcedureSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcedureSectionMoodCode(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionMoodCode(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcedureSectionMoodCode(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionMoodCode(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcedureSection The receiving '<em><b>Laborand Delivery Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcedureSectionMoodCode(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCEDURE_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcedureSectionLaborandDeliveryProcedureSectionMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcedureSection, context) }),
						new Object[] { laborandDeliveryProcedureSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcedureSectionCode(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionCode(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '29300-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcedureSectionCode(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionCode(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcedureSection The receiving '<em><b>Laborand Delivery Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcedureSectionCode(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCEDURE_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcedureSectionLaborandDeliveryProcedureSectionCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcedureSection, context) }),
						new Object[] { laborandDeliveryProcedureSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcedureSectionCodeP(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionCodeP(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcedureSectionCodeP(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionCodeP(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcedureSection The receiving '<em><b>Laborand Delivery Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcedureSectionCodeP(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCEDURE_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcedureSectionLaborandDeliveryProcedureSectionCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcedureSection, context) }),
						new Object[] { laborandDeliveryProcedureSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcedureSectionText(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionText(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcedureSectionText(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionText(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcedureSection The receiving '<em><b>Laborand Delivery Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcedureSectionText(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCEDURE_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_TEXT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcedureSectionLaborandDeliveryProcedureSectionText",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcedureSection, context) }),
						new Object[] { laborandDeliveryProcedureSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcedureSectionObstetricProcedure(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Obstetric Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionObstetricProcedure(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_OBSTETRIC_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(vsbr::ObstetricProcedure) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcedureSectionObstetricProcedure(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Obstetric Procedure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionObstetricProcedure(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_OBSTETRIC_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcedureSection The receiving '<em><b>Laborand Delivery Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcedureSectionObstetricProcedure(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_OBSTETRIC_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCEDURE_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_OBSTETRIC_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_OBSTETRIC_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_OBSTETRIC_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_OBSTETRIC_PROCEDURE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcedureSectionLaborandDeliveryProcedureSectionObstetricProcedure",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcedureSection, context) }),
						new Object[] { laborandDeliveryProcedureSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliveryProcedureSectionMethodOfDelivery(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Method Of Delivery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionMethodOfDelivery(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_METHOD_OF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(vsbr::MethodofDelivery) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliveryProcedureSectionMethodOfDelivery(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Procedure Section Method Of Delivery</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliveryProcedureSectionMethodOfDelivery(LaborandDeliveryProcedureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_METHOD_OF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliveryProcedureSection The receiving '<em><b>Laborand Delivery Procedure Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliveryProcedureSectionMethodOfDelivery(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_METHOD_OF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_PROCEDURE_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_METHOD_OF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_METHOD_OF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LABORAND_DELIVERY_PROCEDURE_SECTION_METHOD_OF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				laborandDeliveryProcedureSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.LABORAND_DELIVERY_PROCEDURE_SECTION__LABORAND_DELIVERY_PROCEDURE_SECTION_METHOD_OF_DELIVERY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"LaborandDeliveryProcedureSectionLaborandDeliveryProcedureSectionMethodOfDelivery",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										laborandDeliveryProcedureSection, context) }),
						new Object[] { laborandDeliveryProcedureSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getObstetricProcedures(LaborandDeliveryProcedureSection) <em>Get Obstetric Procedures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObstetricProcedures(LaborandDeliveryProcedureSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBSTETRIC_PROCEDURES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(vsbr::ObstetricProcedure)).oclAsType(vsbr::ObstetricProcedure)";

	/**
	 * The cached OCL query for the '{@link #getObstetricProcedures(LaborandDeliveryProcedureSection) <em>Get Obstetric Procedures</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObstetricProcedures(LaborandDeliveryProcedureSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBSTETRIC_PROCEDURES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ObstetricProcedure> getObstetricProcedures(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection) {

		if (GET_OBSTETRIC_PROCEDURES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.LABORAND_DELIVERY_PROCEDURE_SECTION,
				VsbrPackage.Literals.LABORAND_DELIVERY_PROCEDURE_SECTION.getEAllOperations().get(63));
			try {
				GET_OBSTETRIC_PROCEDURES__EOCL_QRY = helper.createQuery(GET_OBSTETRIC_PROCEDURES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_OBSTETRIC_PROCEDURES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ObstetricProcedure> result = (Collection<ObstetricProcedure>) query.evaluate(
			laborandDeliveryProcedureSection);
		return new BasicEList.UnmodifiableEList<ObstetricProcedure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMethodOfDelivery(LaborandDeliveryProcedureSection) <em>Get Method Of Delivery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodOfDelivery(LaborandDeliveryProcedureSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_METHOD_OF_DELIVERY__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(vsbr::MethodofDelivery))->asSequence()->any(true).oclAsType(vsbr::MethodofDelivery)";

	/**
	 * The cached OCL query for the '{@link #getMethodOfDelivery(LaborandDeliveryProcedureSection) <em>Get Method Of Delivery</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodOfDelivery(LaborandDeliveryProcedureSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_METHOD_OF_DELIVERY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MethodofDelivery getMethodOfDelivery(
			LaborandDeliveryProcedureSection laborandDeliveryProcedureSection) {

		if (GET_METHOD_OF_DELIVERY__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.LABORAND_DELIVERY_PROCEDURE_SECTION,
				VsbrPackage.Literals.LABORAND_DELIVERY_PROCEDURE_SECTION.getEAllOperations().get(64));
			try {
				GET_METHOD_OF_DELIVERY__EOCL_QRY = helper.createQuery(GET_METHOD_OF_DELIVERY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_METHOD_OF_DELIVERY__EOCL_QRY);
		return (MethodofDelivery) query.evaluate(laborandDeliveryProcedureSection);
	}

} // LaborandDeliveryProcedureSectionOperations
