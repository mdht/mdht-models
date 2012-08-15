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
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct;

import org.openhealthtools.mdht.uml.cda.phcr.silicosis.util.SilicosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Possible Exposure Location And Type Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct#validateSilicosisPossibleExposureLocationAndTypeActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct#validateSilicosisPossibleExposureLocationAndTypeActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct#validateSilicosisPossibleExposureLocationAndTypeActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct#validateSilicosisPossibleExposureLocationAndTypeActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct#validateSilicosisPossibleExposureLocationAndTypeActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SilicosisPossibleExposureLocationAndTypeActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SilicosisPossibleExposureLocationAndTypeActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSilicosisPossibleExposureLocationAndTypeActTemplateId(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateSilicosisPossibleExposureLocationAndTypeActTemplateId(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.109')";

  /**
	 * The cached OCL invariant for the '{@link #validateSilicosisPossibleExposureLocationAndTypeActTemplateId(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateSilicosisPossibleExposureLocationAndTypeActTemplateId(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.109')
	 * @param silicosisPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateSilicosisPossibleExposureLocationAndTypeActTemplateId(SilicosisPossibleExposureLocationAndTypeAct silicosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SilicosisPackage.Literals.SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisPossibleExposureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SilicosisValidator.DIAGNOSTIC_SOURCE,
						 SilicosisValidator.SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID,
						 SilicosisPlugin.INSTANCE.getString("SilicosisPossibleExposureLocationAndTypeActTemplateId"),
						 new Object [] { silicosisPossibleExposureLocationAndTypeAct }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateSilicosisPossibleExposureLocationAndTypeActClassCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSilicosisPossibleExposureLocationAndTypeActClassCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateSilicosisPossibleExposureLocationAndTypeActClassCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSilicosisPossibleExposureLocationAndTypeActClassCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param silicosisPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSilicosisPossibleExposureLocationAndTypeActClassCode(SilicosisPossibleExposureLocationAndTypeAct silicosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SilicosisPackage.Literals.SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisPossibleExposureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SilicosisValidator.DIAGNOSTIC_SOURCE,
						 SilicosisValidator.SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE,
						 SilicosisPlugin.INSTANCE.getString("SilicosisPossibleExposureLocationAndTypeActClassCode"),
						 new Object [] { silicosisPossibleExposureLocationAndTypeAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSilicosisPossibleExposureLocationAndTypeActCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSilicosisPossibleExposureLocationAndTypeActCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateSilicosisPossibleExposureLocationAndTypeActCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSilicosisPossibleExposureLocationAndTypeActCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96')
	 * @param silicosisPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSilicosisPossibleExposureLocationAndTypeActCode(SilicosisPossibleExposureLocationAndTypeAct silicosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SilicosisPackage.Literals.SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisPossibleExposureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SilicosisValidator.DIAGNOSTIC_SOURCE,
						 SilicosisValidator.SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE,
						 SilicosisPlugin.INSTANCE.getString("SilicosisPossibleExposureLocationAndTypeActCode"),
						 new Object [] { silicosisPossibleExposureLocationAndTypeAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSilicosisPossibleExposureLocationAndTypeActMoodCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSilicosisPossibleExposureLocationAndTypeActMoodCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateSilicosisPossibleExposureLocationAndTypeActMoodCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSilicosisPossibleExposureLocationAndTypeActMoodCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('moodCode')
	 * @param silicosisPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSilicosisPossibleExposureLocationAndTypeActMoodCode(SilicosisPossibleExposureLocationAndTypeAct silicosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SilicosisPackage.Literals.SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisPossibleExposureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SilicosisValidator.DIAGNOSTIC_SOURCE,
						 SilicosisValidator.SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE,
						 SilicosisPlugin.INSTANCE.getString("SilicosisPossibleExposureLocationAndTypeActMoodCode"),
						 new Object [] { silicosisPossibleExposureLocationAndTypeAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSilicosisPossibleExposureLocationAndTypeActStatusCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSilicosisPossibleExposureLocationAndTypeActStatusCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateSilicosisPossibleExposureLocationAndTypeActStatusCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSilicosisPossibleExposureLocationAndTypeActStatusCode(SilicosisPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param silicosisPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSilicosisPossibleExposureLocationAndTypeActStatusCode(SilicosisPossibleExposureLocationAndTypeAct silicosisPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SilicosisPackage.Literals.SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(silicosisPossibleExposureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SilicosisValidator.DIAGNOSTIC_SOURCE,
						 SilicosisValidator.SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE,
						 SilicosisPlugin.INSTANCE.getString("SilicosisPossibleExposureLocationAndTypeActStatusCode"),
						 new Object [] { silicosisPossibleExposureLocationAndTypeAct }));
			}
			 
			return false;
		}
		return true;
	}

} // SilicosisPossibleExposureLocationAndTypeActOperations