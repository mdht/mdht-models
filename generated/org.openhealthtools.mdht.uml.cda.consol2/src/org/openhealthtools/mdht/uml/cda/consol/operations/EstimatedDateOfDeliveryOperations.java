/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
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
import org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Estimated Date Of Delivery</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery#validateEstimatedDateOfDeliveryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery#validateEstimatedDateOfDeliveryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery#validateEstimatedDateOfDeliveryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery#validateEstimatedDateOfDeliveryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery#validateEstimatedDateOfDeliveryStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EstimatedDateOfDelivery#validateEstimatedDateOfDeliveryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EstimatedDateOfDeliveryOperations extends ClinicalStatementOperations {
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
	protected EstimatedDateOfDeliveryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstimatedDateOfDeliveryTemplateId(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryTemplateId(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTIMATED_DATE_OF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEstimatedDateOfDeliveryTemplateId(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryTemplateId(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ESTIMATED_DATE_OF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param estimatedDateOfDelivery The receiving '<em><b>Estimated Date Of Delivery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEstimatedDateOfDeliveryTemplateId(EstimatedDateOfDelivery estimatedDateOfDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "EstimatedDateOfDeliveryEstimatedDateOfDeliveryTemplateId", "ERROR");

		if (VALIDATE_ESTIMATED_DATE_OF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ESTIMATED_DATE_OF_DELIVERY);
			try {
				VALIDATE_ESTIMATED_DATE_OF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ESTIMATED_DATE_OF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ESTIMATED_DATE_OF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				estimatedDateOfDelivery)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ESTIMATED_DATE_OF_DELIVERY__ESTIMATED_DATE_OF_DELIVERY_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("EstimatedDateOfDeliveryEstimatedDateOfDeliveryTemplateId"),
						new Object[] { estimatedDateOfDelivery }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstimatedDateOfDeliveryClassCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryClassCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTIMATED_DATE_OF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateEstimatedDateOfDeliveryClassCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryClassCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ESTIMATED_DATE_OF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param estimatedDateOfDelivery The receiving '<em><b>Estimated Date Of Delivery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEstimatedDateOfDeliveryClassCode(EstimatedDateOfDelivery estimatedDateOfDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "EstimatedDateOfDeliveryEstimatedDateOfDeliveryClassCode", "ERROR");

		if (VALIDATE_ESTIMATED_DATE_OF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ESTIMATED_DATE_OF_DELIVERY);
			try {
				VALIDATE_ESTIMATED_DATE_OF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ESTIMATED_DATE_OF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ESTIMATED_DATE_OF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				estimatedDateOfDelivery)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ESTIMATED_DATE_OF_DELIVERY__ESTIMATED_DATE_OF_DELIVERY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("EstimatedDateOfDeliveryEstimatedDateOfDeliveryClassCode"),
						new Object[] { estimatedDateOfDelivery }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstimatedDateOfDeliveryCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTIMATED_DATE_OF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '11778-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEstimatedDateOfDeliveryCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ESTIMATED_DATE_OF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param estimatedDateOfDelivery The receiving '<em><b>Estimated Date Of Delivery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEstimatedDateOfDeliveryCode(EstimatedDateOfDelivery estimatedDateOfDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "EstimatedDateOfDeliveryEstimatedDateOfDeliveryCode", "ERROR");

		if (VALIDATE_ESTIMATED_DATE_OF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ESTIMATED_DATE_OF_DELIVERY);
			try {
				VALIDATE_ESTIMATED_DATE_OF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ESTIMATED_DATE_OF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				estimatedDateOfDelivery)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ESTIMATED_DATE_OF_DELIVERY__ESTIMATED_DATE_OF_DELIVERY_CODE,
						ConsolPlugin.INSTANCE.getString("EstimatedDateOfDeliveryEstimatedDateOfDeliveryCode"),
						new Object[] { estimatedDateOfDelivery }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstimatedDateOfDeliveryMoodCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryMoodCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTIMATED_DATE_OF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateEstimatedDateOfDeliveryMoodCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryMoodCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ESTIMATED_DATE_OF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param estimatedDateOfDelivery The receiving '<em><b>Estimated Date Of Delivery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEstimatedDateOfDeliveryMoodCode(EstimatedDateOfDelivery estimatedDateOfDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "EstimatedDateOfDeliveryEstimatedDateOfDeliveryMoodCode", "ERROR");

		if (VALIDATE_ESTIMATED_DATE_OF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ESTIMATED_DATE_OF_DELIVERY);
			try {
				VALIDATE_ESTIMATED_DATE_OF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ESTIMATED_DATE_OF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ESTIMATED_DATE_OF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				estimatedDateOfDelivery)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ESTIMATED_DATE_OF_DELIVERY__ESTIMATED_DATE_OF_DELIVERY_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("EstimatedDateOfDeliveryEstimatedDateOfDeliveryMoodCode"),
						new Object[] { estimatedDateOfDelivery }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstimatedDateOfDeliveryStatusCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryStatusCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTIMATED_DATE_OF_DELIVERY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateEstimatedDateOfDeliveryStatusCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryStatusCode(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ESTIMATED_DATE_OF_DELIVERY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param estimatedDateOfDelivery The receiving '<em><b>Estimated Date Of Delivery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEstimatedDateOfDeliveryStatusCode(EstimatedDateOfDelivery estimatedDateOfDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "EstimatedDateOfDeliveryEstimatedDateOfDeliveryStatusCode", "ERROR");

		if (VALIDATE_ESTIMATED_DATE_OF_DELIVERY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ESTIMATED_DATE_OF_DELIVERY);
			try {
				VALIDATE_ESTIMATED_DATE_OF_DELIVERY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ESTIMATED_DATE_OF_DELIVERY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ESTIMATED_DATE_OF_DELIVERY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				estimatedDateOfDelivery)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ESTIMATED_DATE_OF_DELIVERY__ESTIMATED_DATE_OF_DELIVERY_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("EstimatedDateOfDeliveryEstimatedDateOfDeliveryStatusCode"),
						new Object[] { estimatedDateOfDelivery }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstimatedDateOfDeliveryValue(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryValue(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTIMATED_DATE_OF_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::TS)))";

	/**
	 * The cached OCL invariant for the '{@link #validateEstimatedDateOfDeliveryValue(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstimatedDateOfDeliveryValue(EstimatedDateOfDelivery, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ESTIMATED_DATE_OF_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param estimatedDateOfDelivery The receiving '<em><b>Estimated Date Of Delivery</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEstimatedDateOfDeliveryValue(EstimatedDateOfDelivery estimatedDateOfDelivery,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "EstimatedDateOfDeliveryEstimatedDateOfDeliveryValue", "ERROR");

		if (VALIDATE_ESTIMATED_DATE_OF_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ESTIMATED_DATE_OF_DELIVERY);
			try {
				VALIDATE_ESTIMATED_DATE_OF_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ESTIMATED_DATE_OF_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ESTIMATED_DATE_OF_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				estimatedDateOfDelivery)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ESTIMATED_DATE_OF_DELIVERY__ESTIMATED_DATE_OF_DELIVERY_VALUE,
						ConsolPlugin.INSTANCE.getString("EstimatedDateOfDeliveryEstimatedDateOfDeliveryValue"),
						new Object[] { estimatedDateOfDelivery }));
			}

			return false;
		}
		return true;
	}

} // EstimatedDateOfDeliveryOperations
