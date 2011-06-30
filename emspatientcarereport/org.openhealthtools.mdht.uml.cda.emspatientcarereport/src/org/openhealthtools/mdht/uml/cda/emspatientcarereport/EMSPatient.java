/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspatientcarereport;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Patient;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMS Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspatientcarereport.EmspatientcarereportPackage#getEMSPatient()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation administrativeGenderCode.codeSystemName='AdministrativeGenderCode' constraints.validation.error='EMSPatientAdministrativeGenderCode' administrativeGenderCode.codeSystem='2.16.840.1.113883.5.1'"
 * @generated
 */
public interface EMSPatient extends Patient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.administrativeGenderCode.oclIsUndefined() or self.administrativeGenderCode.isNullFlavorUndefined()) implies (self.administrativeGenderCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.administrativeGenderCode.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN')))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.administrativeGenderCode.oclIsUndefined() or self.administrativeGenderCode.isNullFlavorUndefined()) implies (self.administrativeGenderCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.administrativeGenderCode.oclAsType(datatypes::CE) in (\nvalue.codeSystem = \'2.16.840.1.113883.5.1\' and (value.code = \'F\' or value.code = \'M\' or value.code = \'UN\')))'"
	 * @generated
	 */
	boolean validateEMSPatientAdministrativeGenderCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSPatient init();
} // EMSPatient
