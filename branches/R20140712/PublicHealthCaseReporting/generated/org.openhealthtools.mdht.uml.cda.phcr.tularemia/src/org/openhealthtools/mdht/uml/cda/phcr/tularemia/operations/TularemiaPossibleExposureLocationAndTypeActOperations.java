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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.util.TularemiaValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tularemia Possible Exposure Location And Type Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct#validateTularemiaPossibleExposureLocationAndTypeActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct#validateTularemiaPossibleExposureLocationAndTypeActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct#validateTularemiaPossibleExposureLocationAndTypeActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct#validateTularemiaPossibleExposureLocationAndTypeActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct#validateTularemiaPossibleExposureLocationAndTypeActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct#validateTularemiaPossibleExposureLocationAndTypeActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct#validateTularemiaPossibleExposureLocationAndTypeActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Status Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TularemiaPossibleExposureLocationAndTypeActOperations extends ClinicalStatementOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TularemiaPossibleExposureLocationAndTypeActOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTularemiaPossibleExposureLocationAndTypeActTemplateId(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaPossibleExposureLocationAndTypeActTemplateId(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.43')";

  /**
	 * The cached OCL invariant for the '{@link #validateTularemiaPossibleExposureLocationAndTypeActTemplateId(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaPossibleExposureLocationAndTypeActTemplateId(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.43')
	 * @param tularemiaPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateTularemiaPossibleExposureLocationAndTypeActTemplateId(TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPossibleExposureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID,
						 TularemiaPlugin.INSTANCE.getString("TularemiaPossibleExposureLocationAndTypeActTemplateId"),
						 new Object [] { tularemiaPossibleExposureLocationAndTypeAct }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateTularemiaPossibleExposureLocationAndTypeActClassCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaPossibleExposureLocationAndTypeActClassCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

  /**
	 * The cached OCL invariant for the '{@link #validateTularemiaPossibleExposureLocationAndTypeActClassCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateTularemiaPossibleExposureLocationAndTypeActClassCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static Constraint VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param tularemiaPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  public static  boolean validateTularemiaPossibleExposureLocationAndTypeActClassCode(TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPossibleExposureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE,
						 TularemiaPlugin.INSTANCE.getString("TularemiaPossibleExposureLocationAndTypeActClassCode"),
						 new Object [] { tularemiaPossibleExposureLocationAndTypeAct }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validateTularemiaPossibleExposureLocationAndTypeActMoodCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaPossibleExposureLocationAndTypeActMoodCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

		/**
	 * The cached OCL invariant for the '{@link #validateTularemiaPossibleExposureLocationAndTypeActMoodCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaPossibleExposureLocationAndTypeActMoodCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param tularemiaPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTularemiaPossibleExposureLocationAndTypeActMoodCode(TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPossibleExposureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE,
						 TularemiaPlugin.INSTANCE.getString("TularemiaPossibleExposureLocationAndTypeActMoodCode"),
						 new Object [] { tularemiaPossibleExposureLocationAndTypeAct }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96')
	 * @param tularemiaPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTularemiaPossibleExposureLocationAndTypeActCode(TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeActCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(tularemiaPossibleExposureLocationAndTypeAct)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPossibleExposureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE,
						 TularemiaPlugin.INSTANCE.getString("TularemiaPossibleExposureLocationAndTypeActCode"),
						 new Object [] { tularemiaPossibleExposureLocationAndTypeAct }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validateTularemiaPossibleExposureLocationAndTypeActCodeP(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaPossibleExposureLocationAndTypeActCodeP(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

		/**
	 * The cached OCL invariant for the '{@link #validateTularemiaPossibleExposureLocationAndTypeActCodeP(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaPossibleExposureLocationAndTypeActCodeP(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * The cached OCL expression body for the '{@link #validateTularemiaPossibleExposureLocationAndTypeActCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaPossibleExposureLocationAndTypeActCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96')";

		/**
	 * The cached OCL invariant for the '{@link #validateTularemiaPossibleExposureLocationAndTypeActCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaPossibleExposureLocationAndTypeActCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param tularemiaPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTularemiaPossibleExposureLocationAndTypeActCodeP(TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPossibleExposureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE_P,
						 TularemiaPlugin.INSTANCE.getString("TularemiaPossibleExposureLocationAndTypeActCodeP"),
						 new Object [] { tularemiaPossibleExposureLocationAndTypeAct }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeActCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeActCodeP", passToken);
				}
				passToken.add(tularemiaPossibleExposureLocationAndTypeAct);
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validateTularemiaPossibleExposureLocationAndTypeActStatusCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaPossibleExposureLocationAndTypeActStatusCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

		/**
	 * The cached OCL invariant for the '{@link #validateTularemiaPossibleExposureLocationAndTypeActStatusCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaPossibleExposureLocationAndTypeActStatusCode(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param tularemiaPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTularemiaPossibleExposureLocationAndTypeActStatusCode(TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPossibleExposureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE,
						 TularemiaPlugin.INSTANCE.getString("TularemiaPossibleExposureLocationAndTypeActStatusCode"),
						 new Object [] { tularemiaPossibleExposureLocationAndTypeAct }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validateTularemiaPossibleExposureLocationAndTypeActStatusCodeP(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaPossibleExposureLocationAndTypeActStatusCodeP(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

		/**
	 * The cached OCL invariant for the '{@link #validateTularemiaPossibleExposureLocationAndTypeActStatusCodeP(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Possible Exposure Location And Type Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTularemiaPossibleExposureLocationAndTypeActStatusCodeP(TularemiaPossibleExposureLocationAndTypeAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
	 * @param tularemiaPossibleExposureLocationAndTypeAct The receiving '<em><b>Possible Exposure Location And Type Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTularemiaPossibleExposureLocationAndTypeActStatusCodeP(TularemiaPossibleExposureLocationAndTypeAct tularemiaPossibleExposureLocationAndTypeAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TularemiaPackage.Literals.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT);
			try {
				VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPossibleExposureLocationAndTypeAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TularemiaValidator.DIAGNOSTIC_SOURCE,
						 TularemiaValidator.TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE_P,
						 TularemiaPlugin.INSTANCE.getString("TularemiaPossibleExposureLocationAndTypeActStatusCodeP"),
						 new Object [] { tularemiaPossibleExposureLocationAndTypeAct }));
			}
			 
			return false;
		}
		return true;
	}

} // TularemiaPossibleExposureLocationAndTypeActOperations