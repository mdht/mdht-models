/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.flu.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.phcr.flu.FluPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.flu.fluPackage;

import org.openhealthtools.mdht.uml.cda.phcr.flu.util.fluValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Influenza Possible Exposure Location Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPossibleExposureLocationAct#validateInfluenzaPossibleExposureLocationActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Possible Exposure Location Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPossibleExposureLocationAct#validateInfluenzaPossibleExposureLocationActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Possible Exposure Location Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.flu.InfluenzaPossibleExposureLocationAct#validateInfluenzaPossibleExposureLocationActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Possible Exposure Location Act Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfluenzaPossibleExposureLocationActOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenzaPossibleExposureLocationActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaPossibleExposureLocationActTemplateId(InfluenzaPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Possible Exposure Location Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPossibleExposureLocationActTemplateId(InfluenzaPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.82')";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaPossibleExposureLocationActTemplateId(InfluenzaPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Possible Exposure Location Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPossibleExposureLocationActTemplateId(InfluenzaPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.82')
	 * @param influenzaPossibleExposureLocationAct The receiving '<em><b>Influenza Possible Exposure Location Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaPossibleExposureLocationActTemplateId(InfluenzaPossibleExposureLocationAct influenzaPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT);
			try {
				VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaPossibleExposureLocationAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID,
						 FluPlugin.INSTANCE.getString("InfluenzaPossibleExposureLocationActTemplateId"),
						 new Object [] { influenzaPossibleExposureLocationAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaPossibleExposureLocationActCode(InfluenzaPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Possible Exposure Location Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPossibleExposureLocationActCode(InfluenzaPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaPossibleExposureLocationActCode(InfluenzaPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Possible Exposure Location Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPossibleExposureLocationActCode(InfluenzaPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '413350009' and value.codeSystem = '2.16.840.1.113883.6.96'))
	 * @param influenzaPossibleExposureLocationAct The receiving '<em><b>Influenza Possible Exposure Location Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaPossibleExposureLocationActCode(InfluenzaPossibleExposureLocationAct influenzaPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT);
			try {
				VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaPossibleExposureLocationAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE,
						 FluPlugin.INSTANCE.getString("InfluenzaPossibleExposureLocationActCode"),
						 new Object [] { influenzaPossibleExposureLocationAct }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInfluenzaPossibleExposureLocationActStatusCode(InfluenzaPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Possible Exposure Location Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPossibleExposureLocationActStatusCode(InfluenzaPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateInfluenzaPossibleExposureLocationActStatusCode(InfluenzaPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Influenza Possible Exposure Location Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInfluenzaPossibleExposureLocationActStatusCode(InfluenzaPossibleExposureLocationAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param influenzaPossibleExposureLocationAct The receiving '<em><b>Influenza Possible Exposure Location Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInfluenzaPossibleExposureLocationActStatusCode(InfluenzaPossibleExposureLocationAct influenzaPossibleExposureLocationAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(fluPackage.Literals.INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT);
			try {
				VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(influenzaPossibleExposureLocationAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 fluValidator.DIAGNOSTIC_SOURCE,
						 fluValidator.INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT__INFLUENZA_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE,
						 FluPlugin.INSTANCE.getString("InfluenzaPossibleExposureLocationActStatusCode"),
						 new Object [] { influenzaPossibleExposureLocationAct }));
			}
			 
			return false;
		}
		return true;
	}

} // InfluenzaPossibleExposureLocationActOperations