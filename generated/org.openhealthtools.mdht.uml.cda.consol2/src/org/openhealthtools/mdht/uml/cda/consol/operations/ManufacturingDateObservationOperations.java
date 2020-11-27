/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ManufacturingDateObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Manufacturing Date Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ManufacturingDateObservation#validateManufacturingDateObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Manufacturing Date Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ManufacturingDateObservation#validateManufacturingDateObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Manufacturing Date Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ManufacturingDateObservation#validateManufacturingDateObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Manufacturing Date Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManufacturingDateObservationOperations extends ClinicalStatementOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
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
	protected ManufacturingDateObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateManufacturingDateObservationTemplateId(ManufacturingDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Manufacturing Date Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateManufacturingDateObservationTemplateId(ManufacturingDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANUFACTURING_DATE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.316' and id.extension = '2019-06')";

	/**
	 * The cached OCL invariant for the '{@link #validateManufacturingDateObservationTemplateId(ManufacturingDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Manufacturing Date Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateManufacturingDateObservationTemplateId(ManufacturingDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_MANUFACTURING_DATE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param manufacturingDateObservation The receiving '<em><b>Manufacturing Date Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateManufacturingDateObservationTemplateId(
			ManufacturingDateObservation manufacturingDateObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ManufacturingDateObservationManufacturingDateObservationTemplateId", "ERROR");

		if (VALIDATE_MANUFACTURING_DATE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MANUFACTURING_DATE_OBSERVATION);
			try {
				VALIDATE_MANUFACTURING_DATE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MANUFACTURING_DATE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MANUFACTURING_DATE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				manufacturingDateObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MANUFACTURING_DATE_OBSERVATION__MANUFACTURING_DATE_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"ManufacturingDateObservationManufacturingDateObservationTemplateId"),
						new Object[] { manufacturingDateObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateManufacturingDateObservationCode(ManufacturingDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Manufacturing Date Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateManufacturingDateObservationCode(ManufacturingDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANUFACTURING_DATE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = 'C101669' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateManufacturingDateObservationCode(ManufacturingDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Manufacturing Date Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateManufacturingDateObservationCode(ManufacturingDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_MANUFACTURING_DATE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param manufacturingDateObservation The receiving '<em><b>Manufacturing Date Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateManufacturingDateObservationCode(
			ManufacturingDateObservation manufacturingDateObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ManufacturingDateObservationManufacturingDateObservationCode", "ERROR");

		if (VALIDATE_MANUFACTURING_DATE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MANUFACTURING_DATE_OBSERVATION);
			try {
				VALIDATE_MANUFACTURING_DATE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MANUFACTURING_DATE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MANUFACTURING_DATE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				manufacturingDateObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MANUFACTURING_DATE_OBSERVATION__MANUFACTURING_DATE_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString("ManufacturingDateObservationManufacturingDateObservationCode"),
						new Object[] { manufacturingDateObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateManufacturingDateObservationValue(ManufacturingDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Manufacturing Date Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateManufacturingDateObservationValue(ManufacturingDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANUFACTURING_DATE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))";

	/**
	 * The cached OCL invariant for the '{@link #validateManufacturingDateObservationValue(ManufacturingDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Manufacturing Date Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateManufacturingDateObservationValue(ManufacturingDateObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_MANUFACTURING_DATE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param manufacturingDateObservation The receiving '<em><b>Manufacturing Date Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateManufacturingDateObservationValue(
			ManufacturingDateObservation manufacturingDateObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ManufacturingDateObservationManufacturingDateObservationValue", "ERROR");

		if (VALIDATE_MANUFACTURING_DATE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MANUFACTURING_DATE_OBSERVATION);
			try {
				VALIDATE_MANUFACTURING_DATE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MANUFACTURING_DATE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MANUFACTURING_DATE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				manufacturingDateObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MANUFACTURING_DATE_OBSERVATION__MANUFACTURING_DATE_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"ManufacturingDateObservationManufacturingDateObservationValue"),
						new Object[] { manufacturingDateObservation }));
			}

			return false;
		}
		return true;
	}

} // ManufacturingDateObservationOperations
