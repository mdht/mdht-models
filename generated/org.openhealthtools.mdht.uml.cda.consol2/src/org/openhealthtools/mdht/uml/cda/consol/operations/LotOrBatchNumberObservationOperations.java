/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
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
import org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Lot Or Batch Number Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservation#validateLotOrBatchNumberObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservation#validateLotOrBatchNumberObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservation#validateLotOrBatchNumberObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservation#validateLotOrBatchNumberObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LotOrBatchNumberObservationOperations extends ClinicalStatementOperations {
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
	protected LotOrBatchNumberObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLotOrBatchNumberObservationTemplateId(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLotOrBatchNumberObservationTemplateId(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.315' and id.extension = '2019-06-21')";

	/**
	 * The cached OCL invariant for the '{@link #validateLotOrBatchNumberObservationTemplateId(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLotOrBatchNumberObservationTemplateId(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lotOrBatchNumberObservation The receiving '<em><b>Lot Or Batch Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLotOrBatchNumberObservationTemplateId(
			LotOrBatchNumberObservation lotOrBatchNumberObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "LotOrBatchNumberObservationLotOrBatchNumberObservationTemplateId", "ERROR");

		if (VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LOT_OR_BATCH_NUMBER_OBSERVATION);
			try {
				VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lotOrBatchNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LOT_OR_BATCH_NUMBER_OBSERVATION__LOT_OR_BATCH_NUMBER_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"LotOrBatchNumberObservationLotOrBatchNumberObservationTemplateId"),
						new Object[] { lotOrBatchNumberObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLotOrBatchNumberObservationCodeP(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLotOrBatchNumberObservationCodeP(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateLotOrBatchNumberObservationCodeP(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLotOrBatchNumberObservationCodeP(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lotOrBatchNumberObservation The receiving '<em><b>Lot Or Batch Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLotOrBatchNumberObservationCodeP(
			LotOrBatchNumberObservation lotOrBatchNumberObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "LotOrBatchNumberObservationLotOrBatchNumberObservationCodeP", "ERROR");

		if (VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LOT_OR_BATCH_NUMBER_OBSERVATION);
			try {
				VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lotOrBatchNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LOT_OR_BATCH_NUMBER_OBSERVATION__LOT_OR_BATCH_NUMBER_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString("LotOrBatchNumberObservationLotOrBatchNumberObservationCodeP"),
						new Object[] { lotOrBatchNumberObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservationCodeP", passToken);
				}
				passToken.add(lotOrBatchNumberObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLotOrBatchNumberObservationCode(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLotOrBatchNumberObservationCode(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = 'C101672' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateLotOrBatchNumberObservationCode(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLotOrBatchNumberObservationCode(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lotOrBatchNumberObservation The receiving '<em><b>Lot Or Batch Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLotOrBatchNumberObservationCode(
			LotOrBatchNumberObservation lotOrBatchNumberObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(lotOrBatchNumberObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "LotOrBatchNumberObservationLotOrBatchNumberObservationCode", "ERROR");

		if (VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LOT_OR_BATCH_NUMBER_OBSERVATION);
			try {
				VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lotOrBatchNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LOT_OR_BATCH_NUMBER_OBSERVATION__LOT_OR_BATCH_NUMBER_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString("LotOrBatchNumberObservationLotOrBatchNumberObservationCode"),
						new Object[] { lotOrBatchNumberObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLotOrBatchNumberObservationValue(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLotOrBatchNumberObservationValue(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::ST)))";

	/**
	 * The cached OCL invariant for the '{@link #validateLotOrBatchNumberObservationValue(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Lot Or Batch Number Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLotOrBatchNumberObservationValue(LotOrBatchNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param lotOrBatchNumberObservation The receiving '<em><b>Lot Or Batch Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateLotOrBatchNumberObservationValue(
			LotOrBatchNumberObservation lotOrBatchNumberObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "LotOrBatchNumberObservationLotOrBatchNumberObservationValue", "ERROR");

		if (VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.LOT_OR_BATCH_NUMBER_OBSERVATION);
			try {
				VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_LOT_OR_BATCH_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				lotOrBatchNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.LOT_OR_BATCH_NUMBER_OBSERVATION__LOT_OR_BATCH_NUMBER_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString("LotOrBatchNumberObservationLotOrBatchNumberObservationValue"),
						new Object[] { lotOrBatchNumberObservation }));
			}

			return false;
		}
		return true;
	}

} // LotOrBatchNumberObservationOperations
