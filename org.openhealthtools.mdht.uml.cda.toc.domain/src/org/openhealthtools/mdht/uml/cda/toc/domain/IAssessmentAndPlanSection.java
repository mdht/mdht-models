/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assessment And Plan Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     The Assessment and Plan Section contains information about the assessment of the patient's condition and
 *     expectations for care including proposals, goals, and order requests for monitoring, tracking, or improving the
 *     condition of the patient. 
 * </p>
 * <p>
 *     An assessment and plan section varies from the plan of care section defined later in that it includes a
 *     physician assessment of the patient condition. 
 * </p>
 * <p>
 *     <b>NOTE </b>:
 *     The assessments described in this section are physician assessments of the patient's current condition, and do not
 *     include assessments of functional status, or other assessments typically used in nursing. In Implementation Guides
 *     currently selected, when both the assessment and plan are documented, they are included together in a single section
 *     documenting both. When the physician assessment is not present, only the plan of care section appears. There are no
 *     cases where a physician assessment is provided without a plan.   
 * </p>
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAssessmentAndPlanSection#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getAssessmentAndPlanSection()
 * @generated
 */
public interface IAssessmentAndPlanSection {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Section)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getAssessmentAndPlanSection_CDAType()
	 * @generated
	 */
	Section getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IAssessmentAndPlanSection#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Section value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAssessmentAndPlanSection init();
} // IAssessmentAndPlanSection
