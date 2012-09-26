/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPossibleExposureLocationAct;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.util.TuberculosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Possible Exposure Location Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPossibleExposureLocationAct#validateTuberculosisPossibleExposureLocationActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Possible Exposure Location Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPossibleExposureLocationAct#validateTuberculosisPossibleExposureLocationActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Possible Exposure Location Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPossibleExposureLocationAct#validateTuberculosisPossibleExposureLocationActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Possible Exposure Location Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPossibleExposureLocationAct#validateTuberculosisPossibleExposureLocationActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Possible Exposure Location Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPossibleExposureLocationAct#validateTuberculosisPossibleExposureLocationActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Possible Exposure Location Act Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TuberculosisPossibleExposureLocationActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberculosisPossibleExposureLocationActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisPossibleExposureLocationActTemplateId(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Possible Exposure Location Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPossibleExposureLocationActTemplateId(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.12')";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisPossibleExposureLocationActTemplateId(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Possible Exposure Location Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPossibleExposureLocationActTemplateId(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.12')
	 * @param tuberculosisPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTuberculosisPossibleExposureLocationActTemplateId(TuberculosisPossibleExposureLocationAct tuberculosisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT);
			try {
				VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPossibleExposureLocationAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisPossibleExposureLocationActTemplateId"),
						 new Object [] { tuberculosisPossibleExposureLocationAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisPossibleExposureLocationActClassCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Possible Exposure Location Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPossibleExposureLocationActClassCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisPossibleExposureLocationActClassCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Possible Exposure Location Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPossibleExposureLocationActClassCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param tuberculosisPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTuberculosisPossibleExposureLocationActClassCode(TuberculosisPossibleExposureLocationAct tuberculosisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT);
			try {
				VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPossibleExposureLocationAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisPossibleExposureLocationActClassCode"),
						 new Object [] { tuberculosisPossibleExposureLocationAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisPossibleExposureLocationActCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Possible Exposure Location Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPossibleExposureLocationActCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisPossibleExposureLocationActCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Possible Exposure Location Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPossibleExposureLocationActCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96')
	 * @param tuberculosisPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTuberculosisPossibleExposureLocationActCode(TuberculosisPossibleExposureLocationAct tuberculosisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT);
			try {
				VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPossibleExposureLocationAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisPossibleExposureLocationActCode"),
						 new Object [] { tuberculosisPossibleExposureLocationAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisPossibleExposureLocationActMoodCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Possible Exposure Location Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPossibleExposureLocationActMoodCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisPossibleExposureLocationActMoodCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Possible Exposure Location Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPossibleExposureLocationActMoodCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('moodCode')
	 * @param tuberculosisPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTuberculosisPossibleExposureLocationActMoodCode(TuberculosisPossibleExposureLocationAct tuberculosisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT);
			try {
				VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPossibleExposureLocationAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisPossibleExposureLocationActMoodCode"),
						 new Object [] { tuberculosisPossibleExposureLocationAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisPossibleExposureLocationActStatusCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Possible Exposure Location Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPossibleExposureLocationActStatusCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisPossibleExposureLocationActStatusCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Possible Exposure Location Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisPossibleExposureLocationActStatusCode(TuberculosisPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param tuberculosisPossibleExposureLocationAct The receiving '<em><b>Possible Exposure Location Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTuberculosisPossibleExposureLocationActStatusCode(TuberculosisPossibleExposureLocationAct tuberculosisPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT);
			try {
				VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisPossibleExposureLocationAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__TUBERCULOSIS_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE,
						 TuberculosisPlugin.INSTANCE.getString("TuberculosisPossibleExposureLocationActStatusCode"),
						 new Object [] { tuberculosisPossibleExposureLocationAct }));
			}
			 
			return false;
		}
		return true;
	}

} // TuberculosisPossibleExposureLocationActOperations