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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeriesAct;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Series Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActIdHasRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Id Has Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActIdNoExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Id No Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActCodeQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActCodeQualifierCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActCodeQualifierValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActCodeQualifierValueCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier Value Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#validateSeriesActSOPInstanceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act SOP Instance Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SeriesAct#getSOPInstanceObservations() <em>Get SOP Instance Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeriesActOperations extends ClinicalStatementOperations {
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
	protected SeriesActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriesActIdHasRoot(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Id Has Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActIdHasRoot(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIES_ACT_ID_HAS_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->forAll( not root.oclIsUndefined() )";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriesActIdHasRoot(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Id Has Root</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActIdHasRoot(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERIES_ACT_ID_HAS_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriesAct The receiving '<em><b>Series Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSeriesActIdHasRoot(SeriesAct seriesAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SeriesActSeriesActIdHasRoot", "ERROR");

		if (VALIDATE_SERIES_ACT_ID_HAS_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERIES_ACT);
			try {
				VALIDATE_SERIES_ACT_ID_HAS_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SERIES_ACT_ID_HAS_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIES_ACT_ID_HAS_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			seriesAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERIES_ACT__SERIES_ACT_ID_HAS_ROOT,
						ConsolPlugin.INSTANCE.getString("SeriesActSeriesActIdHasRoot"), new Object[] { seriesAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriesActIdNoExtension(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Id No Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActIdNoExtension(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIES_ACT_ID_NO_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.id->forAll(  extension.oclIsUndefined() )";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriesActIdNoExtension(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Id No Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActIdNoExtension(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERIES_ACT_ID_NO_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriesAct The receiving '<em><b>Series Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSeriesActIdNoExtension(SeriesAct seriesAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SeriesActSeriesActIdNoExtension", "ERROR");

		if (VALIDATE_SERIES_ACT_ID_NO_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERIES_ACT);
			try {
				VALIDATE_SERIES_ACT_ID_NO_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SERIES_ACT_ID_NO_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SERIES_ACT_ID_NO_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriesAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERIES_ACT__SERIES_ACT_ID_NO_EXTENSION,
						ConsolPlugin.INSTANCE.getString("SeriesActSeriesActIdNoExtension"),
						new Object[] { seriesAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriesActCodeQualifier(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActCodeQualifier(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIES_ACT_CODE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.qualifier->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriesActCodeQualifier(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActCodeQualifier(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERIES_ACT_CODE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriesAct The receiving '<em><b>Series Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSeriesActCodeQualifier(SeriesAct seriesAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SeriesActSeriesActCodeQualifier", "ERROR");

		if (VALIDATE_SERIES_ACT_CODE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERIES_ACT);
			try {
				VALIDATE_SERIES_ACT_CODE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SERIES_ACT_CODE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIES_ACT_CODE_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			seriesAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERIES_ACT__SERIES_ACT_CODE_QUALIFIER,
						ConsolPlugin.INSTANCE.getString("SeriesActSeriesActCodeQualifier"),
						new Object[] { seriesAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriesActCodeQualifierCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActCodeQualifierCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIES_ACT_CODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.qualifier.name->one(name : datatypes::CV | name.code = '121139' and name.codeSystem = '1.2.840.10008.2.16.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriesActCodeQualifierCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActCodeQualifierCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERIES_ACT_CODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriesAct The receiving '<em><b>Series Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSeriesActCodeQualifierCode(SeriesAct seriesAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SeriesActSeriesActCodeQualifierCode", "ERROR");

		if (VALIDATE_SERIES_ACT_CODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERIES_ACT);
			try {
				VALIDATE_SERIES_ACT_CODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SERIES_ACT_CODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SERIES_ACT_CODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriesAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERIES_ACT__SERIES_ACT_CODE_QUALIFIER_CODE,
						ConsolPlugin.INSTANCE.getString("SeriesActSeriesActCodeQualifierCode"),
						new Object[] { seriesAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriesActCodeQualifierValue(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActCodeQualifierValue(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIES_ACT_CODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.qualifier.value->one(val | not val.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriesActCodeQualifierValue(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActCodeQualifierValue(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERIES_ACT_CODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriesAct The receiving '<em><b>Series Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSeriesActCodeQualifierValue(SeriesAct seriesAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SeriesActSeriesActCodeQualifierValue", "ERROR");

		if (VALIDATE_SERIES_ACT_CODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERIES_ACT);
			try {
				VALIDATE_SERIES_ACT_CODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SERIES_ACT_CODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SERIES_ACT_CODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriesAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERIES_ACT__SERIES_ACT_CODE_QUALIFIER_VALUE,
						ConsolPlugin.INSTANCE.getString("SeriesActSeriesActCodeQualifierValue"),
						new Object[] { seriesAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriesActCodeQualifierValueCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier Value Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActCodeQualifierValueCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIES_ACT_CODE_QUALIFIER_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.qualifier.value->one(val | (not val.oclIsUndefined() or val.isNullFlavorUndefined()) implies val.oclIsKindOf(datatypes::ANY) and val.codeSystem = '1.2.840.10008.2.16.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriesActCodeQualifierValueCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code Qualifier Value Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActCodeQualifierValueCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERIES_ACT_CODE_QUALIFIER_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriesAct The receiving '<em><b>Series Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSeriesActCodeQualifierValueCode(SeriesAct seriesAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SeriesActSeriesActCodeQualifierValueCode", "ERROR");

		if (VALIDATE_SERIES_ACT_CODE_QUALIFIER_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERIES_ACT);
			try {
				VALIDATE_SERIES_ACT_CODE_QUALIFIER_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SERIES_ACT_CODE_QUALIFIER_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SERIES_ACT_CODE_QUALIFIER_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriesAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERIES_ACT__SERIES_ACT_CODE_QUALIFIER_VALUE_CODE,
						ConsolPlugin.INSTANCE.getString("SeriesActSeriesActCodeQualifierValueCode"),
						new Object[] { seriesAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriesActTemplateId(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActTemplateId(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIES_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.63')";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriesActTemplateId(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActTemplateId(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERIES_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriesAct The receiving '<em><b>Series Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSeriesActTemplateId(SeriesAct seriesAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SeriesActSeriesActTemplateId", "ERROR");

		if (VALIDATE_SERIES_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERIES_ACT);
			try {
				VALIDATE_SERIES_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SERIES_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIES_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			seriesAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERIES_ACT__SERIES_ACT_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("SeriesActSeriesActTemplateId"), new Object[] { seriesAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriesActClassCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActClassCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIES_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriesActClassCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActClassCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERIES_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriesAct The receiving '<em><b>Series Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSeriesActClassCode(SeriesAct seriesAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SeriesActSeriesActClassCode", "ERROR");

		if (VALIDATE_SERIES_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERIES_ACT);
			try {
				VALIDATE_SERIES_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SERIES_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIES_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			seriesAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERIES_ACT__SERIES_ACT_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("SeriesActSeriesActClassCode"), new Object[] { seriesAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriesActMoodCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActMoodCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIES_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriesActMoodCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActMoodCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERIES_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriesAct The receiving '<em><b>Series Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSeriesActMoodCode(SeriesAct seriesAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SeriesActSeriesActMoodCode", "ERROR");

		if (VALIDATE_SERIES_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERIES_ACT);
			try {
				VALIDATE_SERIES_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SERIES_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIES_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			seriesAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERIES_ACT__SERIES_ACT_MOOD_CODE,
						ConsolPlugin.INSTANCE.getString("SeriesActSeriesActMoodCode"), new Object[] { seriesAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriesActCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIES_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '113015' and value.codeSystem = '1.2.840.10008.2.16.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriesActCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActCode(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERIES_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriesAct The receiving '<em><b>Series Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSeriesActCode(SeriesAct seriesAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SeriesActSeriesActCode", "ERROR");

		if (VALIDATE_SERIES_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERIES_ACT);
			try {
				VALIDATE_SERIES_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SERIES_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIES_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			seriesAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERIES_ACT__SERIES_ACT_CODE,
						ConsolPlugin.INSTANCE.getString("SeriesActSeriesActCode"), new Object[] { seriesAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriesActEffectiveTime(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActEffectiveTime(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIES_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriesActEffectiveTime(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActEffectiveTime(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERIES_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriesAct The receiving '<em><b>Series Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSeriesActEffectiveTime(SeriesAct seriesAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SeriesActSeriesActEffectiveTime", "WARNING");

		if (VALIDATE_SERIES_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERIES_ACT);
			try {
				VALIDATE_SERIES_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SERIES_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIES_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			seriesAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERIES_ACT__SERIES_ACT_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("SeriesActSeriesActEffectiveTime"),
						new Object[] { seriesAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriesActId(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActId(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIES_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriesActId(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActId(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERIES_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriesAct The receiving '<em><b>Series Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSeriesActId(SeriesAct seriesAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SeriesActSeriesActId", "ERROR");

		if (VALIDATE_SERIES_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERIES_ACT);
			try {
				VALIDATE_SERIES_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SERIES_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIES_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			seriesAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.SERIES_ACT__SERIES_ACT_ID,
						ConsolPlugin.INSTANCE.getString("SeriesActSeriesActId"), new Object[] { seriesAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriesActText(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActText(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIES_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriesActText(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActText(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERIES_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriesAct The receiving '<em><b>Series Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSeriesActText(SeriesAct seriesAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SeriesActSeriesActText", "INFO");

		if (VALIDATE_SERIES_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERIES_ACT);
			try {
				VALIDATE_SERIES_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SERIES_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_SERIES_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			seriesAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.SERIES_ACT__SERIES_ACT_TEXT,
						ConsolPlugin.INSTANCE.getString("SeriesActSeriesActText"), new Object[] { seriesAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSeriesActSOPInstanceObservation(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act SOP Instance Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActSOPInstanceObservation(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERIES_ACT_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SOPInstanceObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateSeriesActSOPInstanceObservation(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Series Act SOP Instance Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSeriesActSOPInstanceObservation(SeriesAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERIES_ACT_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param seriesAct The receiving '<em><b>Series Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSeriesActSOPInstanceObservation(SeriesAct seriesAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "SeriesActSeriesActSOPInstanceObservation", "ERROR");

		if (VALIDATE_SERIES_ACT_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERIES_ACT);
			try {
				VALIDATE_SERIES_ACT_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SERIES_ACT_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SERIES_ACT_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(seriesAct)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERIES_ACT__SERIES_ACT_SOP_INSTANCE_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("SeriesActSeriesActSOPInstanceObservation"),
						new Object[] { seriesAct }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSOPInstanceObservations(SeriesAct) <em>Get SOP Instance Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOPInstanceObservations(SeriesAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOP_INSTANCE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SOPInstanceObservation)).oclAsType(consol::SOPInstanceObservation)";

	/**
	 * The cached OCL query for the '{@link #getSOPInstanceObservations(SeriesAct) <em>Get SOP Instance Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOPInstanceObservations(SeriesAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOP_INSTANCE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SOPInstanceObservation> getSOPInstanceObservations(SeriesAct seriesAct) {

		if (GET_SOP_INSTANCE_OBSERVATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SERIES_ACT, ConsolPackage.Literals.SERIES_ACT.getEAllOperations().get(65));
			try {
				GET_SOP_INSTANCE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_SOP_INSTANCE_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_SOP_INSTANCE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SOPInstanceObservation> result = (Collection<SOPInstanceObservation>) query.evaluate(seriesAct);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

} // SeriesActOperations
